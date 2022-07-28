class RotateArray {
    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        // reverse array
        int l = 0, r = nums.length - 1;
        reverse(nums, l, r);

        // reverse left part
        r = k - 1;
        reverse(nums, l, r);

        // reverse right part
        l = k;
        r = nums.length - 1;
        reverse(nums, l, r);
    }
}