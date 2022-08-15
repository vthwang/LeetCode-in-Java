class ReverseWordsInAStringIii {
    private void reverseWords(char[] chars, int r, int l) {
        while (l < r) {
            char temp = chars[r];
            chars[r] = chars[l];
            chars[l] = temp;
            l++;
            r--;
        }
    }

    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                r = i - 1;
                reverseWords(chars, r, l);
                l = i + 1;
            }
        }
        r = chars.length - 1;
        reverseWords(chars, r, l);

        return String.valueOf(chars);
    }
}