class SingleNumber {
    public int singleNumber(int[] nums) {
        int ret = 0;
        for (int n : nums) ret = ret ^ n;
        return ret;
    }
}