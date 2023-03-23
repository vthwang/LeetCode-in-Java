import java.util.ArrayList;
import java.util.List;

class NumberOfOperationsToMakeNetworkConnected {
    List<Integer>[] edges;
    boolean[] visited;

    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }

        edges = new List[n];
        for (int i = 0; i < n; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int[] connection : connections) {
            edges[connection[0]].add(connection[1]);
            edges[connection[1]].add(connection[0]);
        }

        visited = new boolean[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                res++;
            }
        }

        return res - 1;
    }

    private void dfs(int n) {
        visited[n] = true;
        for (int v : edges[n]) {
            if (!visited[v]) {
                dfs(v);
            }
        }
    }
}