import java.util.Arrays;

class MatchsticksToSquare {
    private void reverse(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }

    private boolean dfs(int[] nums, int[] sums, int index, int target) {
        if (index == nums.length) {
            return sums[0] == target && sums[1] == target && sums[2] == target;
        }
        for (int i = 0; i < 4; i++) {
            if (sums[i] + nums[index] > target) continue;
            sums[i] += nums[index];
            if (dfs(nums, sums, index + 1, target)) return true;
            sums[i] -= nums[index];
        }
        return false;
    }

    public boolean makesquare(int[] matchsticks) {
        if (matchsticks == null || matchsticks.length < 4) return false;
        int l = matchsticks.length;
        int perimeter = 0;
        for (int i = 0; i < l; i++) {
            perimeter += matchsticks[i];
        }
        if (perimeter % 4 != 0) return false;
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        return dfs(matchsticks, new int[4], 0, perimeter / 4);
    }
}