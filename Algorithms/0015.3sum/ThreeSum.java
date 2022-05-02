import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort numbers
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();

        // Only need to find three numbers, so we just need to find length - 2 numbers
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            // Remove duplicates
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            // Double pointers method
            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                } else if (nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    // Remove duplicates
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }
            }
        }

        return res;
    }
}