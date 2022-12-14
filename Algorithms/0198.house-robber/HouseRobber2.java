class HouseRobber2 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}