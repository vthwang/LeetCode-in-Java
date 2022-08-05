import java.util.Arrays;

class CombinationSumIv2 {
    private int[] dp;

    private int helper(int[] nums, int target) {
        if (dp[target] != -1) return dp[target];
        int res = 0;
        for (int num : nums) {
            if (target >= num) {
                res += helper(nums, target - num);
            }
        }
        return dp[target] = res;
    }

    public int combinationSum4(int[] nums, int target) {
        dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return helper(nums, target);
    }
}