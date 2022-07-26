class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0, h = nums.length;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] >= target) h = m;
            else l = m + 1;
        }
        return l;
    }
}