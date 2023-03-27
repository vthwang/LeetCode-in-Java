# [2316. Count Unreachable Pairs of Nodes in an Undirected Graph](https://leetcode.com/problems/count-unreachable-pairs-of-nodes-in-an-undirected-graph/)

You are given an integer `n`. There is an **undirected** graph with `n` nodes, numbered from `0` to `n - 1`. You are given a 2D integer array `edges` where `edges[i] = [a<sub>i</sub>, b<sub>i</sub>]` denotes that there exists an **undirected** edge connecting nodes `a<sub>i</sub>` and `b<sub>i</sub>`.

Return _the **number of pairs** of different nodes that are **unreachable** from each other_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/05/05/tc-3.png)

```
Input: n = 3, edges = [[0,1],[0,2],[1,2]]
Output: 0
Explanation: There are no pairs of nodes that are unreachable from each other. Therefore, we return 0.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/05/05/tc-2.png)

```
Input: n = 7, edges = [[0,2],[0,5],[2,4],[1,6],[5,4]]
Output: 14
Explanation: There are 14 pairs of nodes that are unreachable from each other:
[[0,1],[0,3],[0,6],[1,2],[1,3],[1,4],[1,5],[2,3],[2,6],[3,4],[3,5],[3,6],[4,6],[5,6]].
Therefore, we return 14.
```

## Solutions
### [DFS](CountUnreachablePairsOfNodesInAnUndirectedGraph.java)

Idea: Suppose the size of the current connected graph is `count`, then the unreachable nodes is `count` multiply the accumulated count number `total`.

```java
class Solution {
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
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the amount of the nodes in the graph.
- Space Complexity: $O(n)$.
