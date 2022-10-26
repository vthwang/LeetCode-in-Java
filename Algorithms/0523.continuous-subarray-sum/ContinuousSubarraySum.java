import java.util.HashMap;
import java.util.Map;

class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>(Map.of(0, 0));
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (!hashMap.containsKey(sum % k))
                hashMap.put(sum % k, i + 1);
            else if (hashMap.get(sum % k) < i)
                return true;
        }
        return false;
    }
}