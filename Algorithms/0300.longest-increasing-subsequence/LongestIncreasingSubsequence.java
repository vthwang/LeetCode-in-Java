import java.util.Arrays;

class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            int max = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    if (max < dp[j] + 1) max = dp[j] + 1;
                }
            }
            dp[i] = max;
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}