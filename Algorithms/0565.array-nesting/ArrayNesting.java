class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            for (int j = i; nums[j] != -1;) {
                cnt++;
                int t = nums[j];
                nums[j] = -1;
                j = t;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}