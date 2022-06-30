import java.util.Arrays;

class MinimumMovesToEqualArrayElementsIi2 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int i = 0, j = nums.length - 1;
        int steps = 0;
        while (i < j) {
            steps += (nums[j] - nums[i]);
            i++;
            j--;
        }
        return steps;
    }
}