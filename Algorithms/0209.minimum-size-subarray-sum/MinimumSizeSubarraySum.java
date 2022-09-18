class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, left = 0, res = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                res = Math.min(res, right - left + 1);
                sum -= nums[left++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}