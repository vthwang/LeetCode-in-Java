import java.util.HashMap;
import java.util.Map;

class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i]))
                return new int[]{hashtable.get(target - nums[i]), i};
            hashtable.put(nums[i], i);
        }
        return new int[]{};
    }
}