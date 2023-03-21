class NumberOfZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
        long res = 0L;
        int c = 0;
        for (int num : nums) {
            if (num != 0) {
                c = 0;
            } else {
                res += ++c;
            }
        }
        return res;
    }
}