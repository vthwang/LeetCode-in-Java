import java.util.Arrays;

class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = costs.length;
        for (int i = 0; i < n; i++) {
            if (costs[i] > coins)
                return i;
            coins -= costs[i];
        }
        return n;
    }
}