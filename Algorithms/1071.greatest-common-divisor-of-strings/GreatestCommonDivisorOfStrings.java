class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length(), n2 = str2.length();
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            String x = str1.substring(0, i);
            if (check(x, str1) && check(x, str2))
                return x;
        }
        return "";
    }

    private boolean check(String t, String s) {
        int n = s.length() / t.length();
        return t.repeat(n).equals(s);
    }
}