import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class CombinationSumIi {
    private void backtrack(LinkedList<Integer> comb, int remain, int curr, List<int[]> counter, List<List<Integer>> res) {
        if (remain <= 0) {
            if (remain == 0) res.add(new ArrayList<>(comb));
            return;
        }
        for (int nextCurr = curr; nextCurr < counter.size(); nextCurr++) {
            int[] entry = counter.get(nextCurr);
            int candidate = entry[0], freq = entry[1];
            if (freq <= 0) continue;
            comb.addLast(candidate);
            counter.set(nextCurr, new int[]{candidate, freq - 1});
            backtrack(comb, remain - candidate, nextCurr, counter, res);
            counter.set(nextCurr, new int[]{candidate, freq});
            comb.removeLast();
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<>();

        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int num : candidates) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        List<int[]> counterList = new ArrayList<>();
        counter.forEach((key, value) -> counterList.add(new int[]{key, value}));
        backtrack(comb, target, 0, counterList, res);
        return res;
    }
}