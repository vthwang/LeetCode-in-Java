import java.util.Arrays;

class MinimumMovesToEqualArrayElementsIi {
    public int minMoves2(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        int m = nums.length % 2 == 0 ? (nums[l / 2] + nums[l / 2 - 1]) / 2 : nums[l / 2];
        int steps = 0;
        for (int num : nums) {
            steps += Math.abs(num - m);
        }
        return steps;
    }
}