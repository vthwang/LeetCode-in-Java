import java.util.TreeSet;

class MinimizeDeviationInArray {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num % 2 == 0 ? num : num * 2);
        }
        int res = set.last() - set.first();
        while (res > 0 && set.last() % 2 == 0) {
            int max = set.last();
            set.remove(max);
            set.add(max / 2);
            res = Math.min(res, set.last() - set.first());
        }
        return res;
    }
}