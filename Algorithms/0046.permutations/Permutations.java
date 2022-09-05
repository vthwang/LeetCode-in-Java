import java.util.ArrayList;
import java.util.List;

class Permutations {
    private void backtrack(List<List<Integer>> lists, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
        } else {
            for (int num : nums) {
                if (list.contains(num)) continue;
                list.add(num);
                backtrack(lists, list, nums);
                list.remove(list.size() - 1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums);
        return res;
    }
}