class MissingNumber {
    public int missingNumber(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) ret = ret ^ i ^ nums[i];
        return ret ^ nums.length;
    }
}