import java.util.ArrayList;
import java.util.List;

class CountUnreachablePairsOfNodesInAnUndirectedGraph {
    List<Integer>[] graph;
    boolean[] visited;
    int count;

    public long countPairs(int n, int[][] edges) {
        graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        visited = new boolean[n];
        long res = 0L;
        for (int i = 0, total = 0; i < n; i++) {
            if (!visited[i]) {
                count = 0;
                dfs(i);
                res += (long) count * total;
                total += count;
            }
        }
        return res;
    }

    private void dfs(int x) {
        visited[x] = true;
        count++;
        for (int y : graph[x]) {
            if (!visited[y]) {
                dfs(y);
            }
        }
    }
}