import java.util.Arrays;

class CountVowelsPermutation {
    private final int mod = (int) (Math.pow(10, 9) + 7);

    public int countVowelPermutation(int n) {
        long[][] dp = new long[n+1][5];
        Arrays.fill(dp[1], 1);

        // a = 0, e = 1, i = 2, o = 3, u = 4
        for (int i = 2; i < n + 1; i++) {
            Arrays.fill(dp[i], 0);
            dp[i][0] = (dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][4]) % mod;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % mod;
            dp[i][2] = (dp[i - 1][1] + dp[i - 1][3]) % mod;
            dp[i][3] = dp[i - 1][2];
            dp[i][4] = (dp[i - 1][2] + dp[i - 1][3]) % mod;
        }

        return (int) (Arrays.stream(dp[n]).sum() % mod);
    }
}