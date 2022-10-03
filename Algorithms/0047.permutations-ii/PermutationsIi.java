import java.util.*;

class PermutationsIi {
    private void backtrack(LinkedList<Integer> comb, int n, HashMap<Integer, Integer> counter, List<List<Integer>> res) {
        if (comb.size() == n) {
            res.add(new ArrayList<>(comb));
            return;
        }
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (count == 0) continue;
            comb.addLast(num);
            counter.put(num, count - 1);
            backtrack(comb, n, counter, res);
            comb.removeLast();
            counter.put(num, count);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        LinkedList<Integer> comb = new LinkedList<>();
        this.backtrack(comb, nums.length, counter, res);
        return res;
    }
}