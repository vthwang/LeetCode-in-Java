class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);


        for (int i = 2; i < nums.length; i++) {
            int max = 0;
            for (int j = i - 2; j >= 0 && j >= i - 3; j--) {
                max = Math.max(max, nums[i] + nums[j]);
            }
            nums[i] = max;
        }

        return Math.max(nums[nums.length - 1], nums[nums.length - 2]);
    }
}