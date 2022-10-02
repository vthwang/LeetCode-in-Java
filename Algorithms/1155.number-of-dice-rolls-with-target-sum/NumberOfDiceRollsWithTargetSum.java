class NumberOfDiceRollsWithTargetSum {
    private final int modulo = (int) (Math.pow(10, 9) + 7);

    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];
        dp[0][0] = 1;

        for (int dice = 1; dice <= n; dice++) {
            for (int targetVal = 0; targetVal <= target; targetVal++) {
                for (int faceVal = 1; faceVal <= k; faceVal++) {
                    if (targetVal >= faceVal) {
                        dp[dice][targetVal] = (dp[dice][targetVal] + dp[dice - 1][targetVal - faceVal]) % modulo;
                    }
                }
            }
        }
        return dp[n][target];
    }
}