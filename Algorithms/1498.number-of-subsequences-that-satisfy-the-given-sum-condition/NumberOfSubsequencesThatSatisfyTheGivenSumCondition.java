import java.util.Arrays;

class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
    static final int modulo = (int) Math.pow(10, 9) + 7;

    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int[] tmp = new int[nums.length];
        tmp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            tmp[i] = (tmp[i - 1] * 2) % modulo;
        }
        int res = 0;
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (nums[l] + nums[r] > target) {
                r--;
            } else {
                res = (res + tmp[r - l]) % modulo;
                l++;
            }
        }
        return res;
    }
}