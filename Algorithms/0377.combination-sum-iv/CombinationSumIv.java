import java.util.HashMap;

class CombinationSumIv {
    public int combinationSum4(int[] nums, int target) {
        HashMap<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 1);
        for (int i = 1; i < target + 1; i++) {
            dp.put(i, 0);
            for (int num : nums) {
                int total = dp.get(i) + dp.getOrDefault(i - num, 0);
                dp.put(i, total);
            }
        }
        return dp.get(target);
    }
}