# [2359. Find Closest Node to Given Two Nodes](https://leetcode.com/problems/find-closest-node-to-given-two-nodes/)

You are given a **directed** graph of `n` nodes numbered from `0` to `n - 1`, where each node has **at most one** outgoing edge.

The graph is represented with a given **0-indexed** array `edges` of size `n`, indicating that there is a directed edge from node `i` to node `edges[i]`. If there is no outgoing edge from `i`, then `edges[i] == -1`.

You are also given two integers `node1` and `node2`.

Return _the **index** of the node that can be reached from both_ `node1` _and_ `node2` _, such that the **maximum** between the distance from_ `node1` _to that node, and from_ `node2` _to that node is **minimized**_. If there are multiple answers, return the node with the **smallest** index, and if no possible answer exists, return `-1`.

Note that `edges` may contain cycles.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/06/07/graph4drawio-2.png)

```
Input: edges = [2,2,3,-1], node1 = 0, node2 = 1
Output: 2
Explanation: The distance from node 0 to node 2 is 1, and the distance from node 1 to node 2 is 1.
The maximum of those two distances is 1. It can be proven that we cannot get a node with a smaller maximum distance than 1, so we return node 2.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/06/07/graph4drawio-4.png)

```
Input: edges = [1,2,-1], node1 = 0, node2 = 2
Output: 2
Explanation: The distance from node 0 to node 2 is 2, and the distance from node 2 to itself is 0.
The maximum of those two distances is 2. It can be proven that we cannot get a node with a smaller maximum distance than 2, so we return node 2.
```

## Solutions
### [BFS](FindClosestNodeToGivenTwoNodes.java)

Idea: We use BFS to iterate all nodes to know the distance from the node1 and node2 to all nodes. Then, we return the value with the minimum distance from the maximum between node1 and node2.

```java
class Solution {
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
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of edges.
- Space Complexity: $O(n)$. `dist1`, `dist2` and `visited` cost $O(n)$ space complexity.

### [DFS](FindClosestNodeToGivenTwoNodes2.java)

Idea: The logic is as same as the above but using DFS.

```java
class Solution {
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
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of edges.
- Space Complexity: $O(n)$. `dist1`, `dist2`, `visited1` and `visited2` cost $O(n)$ space complexity.
