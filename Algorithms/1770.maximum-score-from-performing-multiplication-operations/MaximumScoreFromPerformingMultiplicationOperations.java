import java.util.Arrays;

class MaximumScoreFromPerformingMultiplicationOperations {
    public int maximumScore(int[] nums, int[] multipliers) {
        int n = nums.length;
        int m = multipliers.length;
        int[][] dp = new int[m+1][m+1];

        for (int op = m - 1; op >= 0; op--) {
            for (int left = op; left >= 0; left--) {
                dp[op][left] = Math.max(multipliers[op] * nums[left] + dp[op + 1][left + 1], multipliers[op] * nums[n - 1 - (op - left)] + dp[op + 1][left]);
            }
        }

        return dp[0][0];
    }
}