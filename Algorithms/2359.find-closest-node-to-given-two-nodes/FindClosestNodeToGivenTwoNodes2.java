import java.util.Arrays;

class FindClosestNodeToGivenTwoNodes2 {
    int n;

    public int closestMeetingNode(int[] edges, int node1, int node2) {
        n = edges.length;
        int[] dist1 = new int[n], dist2 = new int[n];
        Arrays.fill(dist1, Integer.MAX_VALUE);
        Arrays.fill(dist2, Integer.MAX_VALUE);
        dist1[node1] = 0;
        dist2[node2] = 0;

        boolean[] visited1 = new boolean[n], visited2 = new boolean[n];

        dfs(node1, edges, dist1, visited1);
        dfs(node2, edges, dist2, visited2);

        int minDistNode = -1, minDistTillNow = Integer.MAX_VALUE;
        for (int currNode = 0; currNode < n; currNode++) {
            if (minDistTillNow > Math.max(dist1[currNode], dist2[currNode])) {
                minDistNode = currNode;
                minDistTillNow = Math.max(dist1[currNode], dist2[currNode]);
            }
        }

        return minDistNode;
    }

    private void dfs(int node, int[] edges, int[] dist, boolean[] visited) {
        visited[node] = true;
        int neighbor = edges[node];
        if (neighbor != -1 && !visited[neighbor]) {
            dist[neighbor] = dist[node] + 1;
            dfs(neighbor, edges, dist, visited);
        }
    }
}