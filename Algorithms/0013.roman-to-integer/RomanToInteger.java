class RomanToInteger {
    private int getNum(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public int romanToInt(String s) {
        int res = 0;
        char[] stringArray = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && getNum(stringArray[i]) < getNum(stringArray[i + 1])) {
                res -= getNum(stringArray[i]);
            } else {
                res += getNum(stringArray[i]);
            }
        }

        return res;
    }
}