# [1319. Number of Operations to Make Network Connected](https://leetcode.com/problems/number-of-operations-to-make-network-connected/)

There are `n` computers numbered from `0` to `n - 1` connected by ethernet cables `connections` forming a network where `connections[i] = [a<sub>i</sub>, b<sub>i</sub>]` represents a connection between computers `a<sub>i</sub>` and `b<sub>i</sub>`. Any computer can reach any other computer directly or indirectly through the network.

You are given an initial computer network `connections`. You can extract certain cables between two directly connected computers, and place them between any pair of disconnected computers to make them directly connected.

Return _the minimum number of times you need to do this in order to make all the computers connected_. If it is not possible, return `-1`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/01/02/sample_1_1677.png)

```
Input: n = 4, connections = [[0,1],[0,2],[1,2]]
Output: 1
Explanation: Remove cable between computer 1 and 2 and place between computers 1 and 3.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/01/02/sample_2_1677.png)

```
Input: n = 6, connections = [[0,1],[0,2],[0,3],[1,2],[1,3]]
Output: 2
```

**Example 3:**

```
Input: n = 6, connections = [[0,1],[0,2],[0,3],[1,2]]
Output: -1
Explanation: There are not enough cables.
```

## Solutions
### [DFS](NumberOfOperationsToMakeNetworkConnected.java)

Idea:  If we have $n$ computers, then we’ll need $n-1$ ethernet cables to connect all computers. First, we check do we have enough cables to connect all computers. Then, we find all connected computers with DFS. After iterates all computers, we’ll know which computer are separated, and we need to use how many cables to connect them together.

```java
class Solution {
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
```

Complexity Analysis:

- Time Complexity: $O(n+m)$. $m$ is the length of `connections`.
- Space Complexity: $O(n+m)$. It costs $O(m)$ to save all edges and costs $O(n)$ for DFS stack.
