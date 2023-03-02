class StringCompression {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0, left = 0;
        for (int read = 0; read < n; read++) {
            if (read == n - 1 || chars[read] != chars[read + 1]) {
                chars[write++] = chars[read];
                int cnt = read - left + 1;
                if (cnt > 1) {
                    String str = String.valueOf(cnt);
                    for (int i = 0; i < str.length(); i++) {
                        chars[write++] = str.charAt(i);
                    }
                }
                left = read + 1;
            }
        }
        return write;
    }
}