import java.util.*;

class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> hashSet = new HashSet<>();

        if (nums == null || nums.length < 4) {
            return res;
        }

        int len = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i <= len - 4; i++) {
            for (int j = i + 1; j <= len - 3; j++) {
                int l = j + 1;
                int r = len - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum < target) {
                        l++;
                    } else if (sum > target) {
                        r--;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        // Remove duplicates
                        if (!hashSet.contains(list)) {
                            hashSet.add(list);
                            res.add(list);
                        }
                        l++;
                        r--;
                    }
                }
            }
        }

        return res;
    }
}