import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class FindClosestNodeToGivenTwoNodes {
    int n;

    public int closestMeetingNode(int[] edges, int node1, int node2) {
        n = edges.length;
        int[] dist1 = new int[n], dist2 = new int[n];
        Arrays.fill(dist1, Integer.MAX_VALUE);
        Arrays.fill(dist2, Integer.MAX_VALUE);

        bfs(node1, edges, dist1);
        bfs(node2, edges, dist2);

        int minDistNode = -1, minDistTillNow = Integer.MAX_VALUE;
        for (int currNode = 0; currNode < n; currNode++) {
            if (minDistTillNow > Math.max(dist1[currNode], dist2[currNode])) {
                minDistNode = currNode;
                minDistTillNow = Math.max(dist1[currNode], dist2[currNode]);
            }
        }

        return minDistNode;
    }

    private void bfs(int startNode, int[] edges, int[] dist) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(startNode);

        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        dist[startNode] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            if (visited[node]) {
                continue;
            }
            visited[node] = true;
            int neighbor = edges[node];
            if (neighbor != -1 && !visited[neighbor]) {
                dist[neighbor] = dist[node] + 1;
                q.offer(neighbor);
            }
        }
    }
}