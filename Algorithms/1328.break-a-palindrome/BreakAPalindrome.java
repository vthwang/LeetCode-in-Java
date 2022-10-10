class BreakAPalindrome {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() <= 1) return "";
        char[] chars = palindrome.toCharArray();
        int len = palindrome.length();
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                chars[i] = 'b';
            }
            if (palindrome.charAt(i) != 'a' && i != (len / 2)) {
                chars[i] = 'a';
                break;
            }
        }
        return String.valueOf(chars);
    }
}