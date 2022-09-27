class PushDominoes {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] indexes = new int[n + 2];
        char[] symbols = new char[n + 2];
        int len = 1;
        indexes[0] = -1;
        symbols[0] = 'L';

        for (int i = 0; i < n; i++) {
            if (dominoes.charAt(i) != '.') {
                indexes[len] = i;
                symbols[len++] = dominoes.charAt(i);
            }
        }

        indexes[len] = n;
        symbols[len++] = 'R';

        char[] res = dominoes.toCharArray();
        for (int index = 0; index < len - 1; index++) {
            int i = indexes[index], j = indexes[index + 1];
            char x = symbols[index], y = symbols[index + 1];
            if (x == y) {
                for (int k = i + 1; k < j; k++) {
                    res[k] = x;
                }
            } else if (x > y) {
                for (int k = i + 1; k < j; k++) {
                    res[k] = k - i == j - k ? '.' : k - i < j - k ? 'R' : 'L';
                }
            }
        }
        return String.valueOf(res);
    }
}