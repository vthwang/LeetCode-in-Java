import java.util.ArrayList;
import java.util.List;

class Combinations {
    private void combine(List<List<Integer>> combines, List<Integer> combine, int start, int n, int k) {
        if (k == 0) {
            combines.add(new ArrayList<>(combine));
            return;
        }
        for (int i = start; i <= n; i++) {
            combine.add(i);
            combine(combines, combine, i + 1, n, k - 1);
            combine.remove(combine.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        combine(res, new ArrayList<>(), 1, n, k);
        return res;
    }
}