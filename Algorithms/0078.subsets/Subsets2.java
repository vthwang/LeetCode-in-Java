import java.util.ArrayList;
import java.util.List;

class Subsets2 {
    List<List<Integer>> res = new ArrayList<>();
    int n, k;

    private void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        if (curr.size() == k) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = first; i < n; i++) {
            curr.add(nums[i]);
            backtrack(i + 1, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        for (k = 0; k < n + 1; k++) {
            backtrack(0, new ArrayList<>(), nums);
        }
        return res;
    }
}