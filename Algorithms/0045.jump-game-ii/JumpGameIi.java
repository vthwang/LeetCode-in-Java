class JumpGameIi {
    public int jump(int[] nums) {
        int n = nums.length;
        int maxPosition = 0, end = 0, steps = 0;
        for (int i = 0; i < n - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}