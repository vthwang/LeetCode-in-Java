class JumpGameVi2 {
    public int maxResult(int[] nums, int k) {
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
                int nextNum = dp[i] + nums[j];
                if (dp[j] < nextNum) dp[j] = nextNum;
                if (dp[j] >= dp[i]) break;
            }
        }
        return dp[nums.length - 1];
    }
}