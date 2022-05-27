class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] preIndexOfs = new int[256];
        int[] preIndexOft = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if (preIndexOfs[sc] != preIndexOft[tc]) {
                return false;
            }
            preIndexOfs[sc] = i + 1;
            preIndexOft[tc] = i + 1;
        }
        return true;
    }
}