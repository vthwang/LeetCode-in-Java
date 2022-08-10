import java.util.Arrays;

class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) return -1;

        int sum = 0, leftSum = 0;
        for (int n : nums) sum += n;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}