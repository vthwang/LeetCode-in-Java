import java.util.Arrays;

class SquaresOfASortedArray2 {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1, i = r;
        int[] squares = new int[nums.length];
        while (i >= 0) {
            int leftNum = Math.abs(nums[l]);
            int rightNum = Math.abs(nums[r]);
            if (leftNum > rightNum) {
                squares[i] = leftNum * leftNum;
                l++;
            } else {
                squares[i] = rightNum * rightNum;
                r--;
            }
            i--;
        }
        return squares;
    }
}