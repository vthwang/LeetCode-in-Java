class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        if (l1 + l2 != l3) return false;

        boolean[][] dp = new boolean[l2 + 1][l1 + 1];
        dp[0][0] = true;

        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = dp[0][j - 1] && (s1.charAt(j -1) == s3.charAt(j - 1));
        }

        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = dp[i - 1][0] && (s2.charAt(i - 1) == s3.charAt(i - 1));
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = (dp[i - 1][j] && (s2.charAt(i - 1) == s3.charAt(i + j - 1))) || (dp[i][j - 1] && (s1.charAt(j - 1) == s3.charAt(i + j -1)));
            }
        }

        return dp[l2][l1];
    }
}