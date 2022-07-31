class NumArray {
    private int[] sums;
    private int[] nums;

    private int getSum(int i) {
        int sum = 0;
        while (i > 0) {
            sum += sums[i];
            i = i - (i & (-i));
        }
        return sum;
    }

    public NumArray(int[] nums) {
        this.nums = new int[nums.length];
        sums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            update(i, nums[i]);
        }
    }
    
    public void update(int index, int val) {
        int diff = val - nums[index];
        int j = index + 1;
        while (j < sums.length) {
            sums[j] += diff;
            j = j + (j & (-j));
        }
        nums[index] = val;
    }
    
    public int sumRange(int left, int right) {
        return getSum(right + 1) - getSum(left);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */