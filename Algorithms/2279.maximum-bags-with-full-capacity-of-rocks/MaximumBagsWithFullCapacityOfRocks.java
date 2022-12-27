import java.util.Arrays;

class MaximumBagsWithFullCapacityOfRocks {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        for (int i = 0; i < n; i++) {
            capacity[i] -= rocks[i];
        }
        Arrays.sort(capacity);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (additionalRocks < capacity[i]) return ans;
            additionalRocks -= capacity[i];
            ans++;
        }
        return ans;
    }
}