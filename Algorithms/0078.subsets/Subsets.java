import java.util.ArrayList;
import java.util.List;

class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();
            for (List<Integer> curr : res) {
                newSubsets.add(new ArrayList<>(curr){{add(num);}});
            }
            res.addAll(newSubsets);
        }
        return res;
    }
}