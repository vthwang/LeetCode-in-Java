import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MinimumFuelCostToReportToTheCapital {
    long fuel;

    public long minimumFuelCost(int[][] roads, int seats) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int[] road : roads) {
            adj.computeIfAbsent(road[0], k -> new ArrayList<>()).add(road[1]);
            adj.computeIfAbsent(road[1], k -> new ArrayList<>()).add(road[0]);
        }
        dfs(0, -1, adj, seats);
        return fuel;
    }

    private long dfs(int node, int parent, Map<Integer, List<Integer>> adj, int seats) {
        int representatives = 1;
        if (!adj.containsKey(node))
            return representatives;
        for (int child : adj.get(node)) {
            if (child != parent)
                representatives += dfs(child, node, adj, seats);
        }
        if (node != 0)
            fuel += Math.ceil((double) representatives / seats);
        return representatives;
    }
}