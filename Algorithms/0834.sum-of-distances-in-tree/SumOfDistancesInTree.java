import java.util.ArrayList;
import java.util.List;

class SumOfDistancesInTree {
    int[] ans, size, dp;
    List<List<Integer>> graph;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        ans = new int[n];
        size = new int[n];
        dp = new int[n];
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        dfs(0, -1);
        dfs2(0, -1);
        return ans;
    }

    public void dfs(int u, int f) {
        size[u] = 1;
        dp[u] = 0;
        for (int v : graph.get(u)) {
            if (v == f) continue;
            dfs(v, u);
            dp[u] += dp[v] + size[v];
            size[u] += size[v];
        }
    }

    public void dfs2(int u, int f) {
        ans[u] = dp[u];
        for (int v : graph.get(u)) {
            if (v == f) continue;
            int parentU = dp[u], parentV = dp[v];
            int childU = size[u], childV = size[v];

            dp[u] -= dp[v] + size[v];
            size[u] -= size[v];
            dp[v] += dp[u] + size[u];
            size[v] += size[u];

            dfs2(v, u);

            dp[u] = parentU;
            dp[v] = parentV;
            size[u] = childU;
            size[v] = childV;
        }
    }
}