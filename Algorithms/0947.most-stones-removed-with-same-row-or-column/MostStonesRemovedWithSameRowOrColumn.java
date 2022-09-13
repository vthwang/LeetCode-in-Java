import java.util.ArrayList;
import java.util.List;

class MostStonesRemovedWithSameRowOrColumn {
    private boolean shareSameRowOrColumn(int[] a, int[] b) {
        return a[0] == b[0] || a[1] == b[1];
    }

    private void dfs(int[][] stones, List<Integer>[] adj, int[] visited, int src) {
        visited[src] = 1;
        for (int adjacent : adj[src]) {
            if (visited[adjacent] == 0) {
                dfs(stones, adj, visited, adjacent);
            }
        }
    }

    public int removeStones(int[][] stones) {
        List<Integer>[] adj = new ArrayList[stones.length];
        for (int i = 0; i < stones.length; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < stones.length; i++) {
            for (int j = i + 1; j < stones.length; j++) {
                if (shareSameRowOrColumn(stones[i], stones[j])) {
                    adj[i].add(j);
                    adj[j].add(i);
                }
            }
        }

        int[] visited = new int[stones.length];
        int componentCount = 0;
        for (int i = 0; i < stones.length; i++) {
            if (visited[i] == 0) {
                componentCount++;
                dfs(stones, adj, visited, i);
            }
        }
        return stones.length - componentCount;
    }
}