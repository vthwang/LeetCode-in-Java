import java.util.HashMap;
import java.util.Map;

class SubarraySumsDivisibleByK {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        counter.put(0, 1);

        int prefixSum = 0, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remainder = (prefixSum % k + k) % k;
            int getCount = counter.getOrDefault(remainder, 0);
            ans += getCount;
            counter.put(remainder, getCount + 1);
        }
        return ans;
    }
}