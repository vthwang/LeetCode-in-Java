import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SubsetsIi {
    List<List<Integer>> res = new ArrayList<>();
    int n, k;

    private void backtrack(int first, List<Integer> curr, int[] nums) {
        if (curr.size() == k && !res.contains(curr)) {
            res.add(new ArrayList<>(curr));
        }
        for (int i = first; i < n; i++) {
            curr.add(nums[i]);
            backtrack(i + 1, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        n = nums.length;
        for (k = 0; k < n + 1; k++) {
            backtrack(0, new ArrayList<>(), nums);
        }
        return res;
    }
}