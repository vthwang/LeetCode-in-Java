import java.util.HashSet;
import java.util.Set;

class MinimumCostForTickets {
    int[] costs;
    Integer[] memo;
    Set<Integer> set;

    public int mincostTickets(int[] days, int[] costs) {
        this.costs = costs;
        memo = new Integer[366];
        set = new HashSet<>();
        for (int day : days) {
            set.add(day);
        }
        return dp(1);
    }

    private int dp(int i) {
        if (i > 365) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }
        if (set.contains(i)) {
            memo[i] = Math.min(Math.min(dp(i + 1) + costs[0], dp(i + 7) + costs[1]), dp(i + 30) + costs[2]);
        } else {
            memo[i] = dp(i + 1);
        }
        return memo[i];
    }
}