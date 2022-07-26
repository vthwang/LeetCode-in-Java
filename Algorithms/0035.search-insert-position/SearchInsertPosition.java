class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int m = l + (h - l) / 2;
        while (l <= h) {
            m = l + (h - l) / 2;
            if (nums[m] > target) {
                h = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return nums[m] > target ? m : m + 1;
    }
}