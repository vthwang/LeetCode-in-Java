import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        // we only want to find three numbers, so we just need to find length - 2 numbers.
        for (int first = 0; first < n - 2; first++) {
            // remove duplicates
            if (first > 0 && nums[first] == nums[first - 1])
                continue;

            int second = first + 1;
            int third = n - 1;
            while (second < third) {
                int threeSum = nums[first] + nums[second] + nums[third];
                if (threeSum < 0)
                    second++;
                else if (threeSum > 0)
                    third--;
                else {
                    ans.add(Arrays.asList(nums[first], nums[second], nums[third]));
                    // remove duplicates in two pointers
                    while (second < third && nums[second] == nums[second + 1])
                        second++;
                    while (second < third && nums[third] == nums[third - 1])
                        third--;
                    second++;
                    third--;
                }
            }
        }
        return ans;
    }
}