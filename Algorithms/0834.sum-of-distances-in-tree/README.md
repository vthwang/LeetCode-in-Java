# [834. Sum of Distances in Tree](https://leetcode.com/problems/sum-of-distances-in-tree/)

There is an undirected connected tree with `n` nodes labeled from `0` to `n - 1` and `n - 1` edges.

You are given the integer `n` and the array `edges` where `edges[i] = [a<sub>i</sub>, b<sub>i</sub>]` indicates that there is an edge between nodes `a<sub>i</sub>` and `b<sub>i</sub>` in the tree.

Return an array `answer` of length `n` where `answer[i]` is the sum of the distances between the `i<sup>th</sup>` node in the tree and all other nodes.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/07/23/lc-sumdist1.jpg)

```
Input: n = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
Output: [8,12,6,10,10,10]
Explanation: The tree is shown above.
We can see that dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5)
equals 1 + 1 + 2 + 2 + 2 = 8.
Hence, answer[0] = 8, and so on.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/07/23/lc-sumdist2.jpg)

```
Input: n = 1, edges = []
Output: [0]
```

**Example 3:**

![](https://assets.leetcode.com/uploads/2021/07/23/lc-sumdist3.jpg)

```
Input: n = 2, edges = [[1,0]]
Output: [1,1]
```

## Solutions
### [Dynamic Programming](SumOfDistancesInTree.java)

Idea: We can use re-root method here. Suppose $u$ has a child node $v$, if we want to calculate the answer of $v$. Let $v$ change to root position and $u$ becomes its child node. In this case, dp values of all nodes does not change except the dp values of $u$ and $v$. Thus, we can come up with two formulas, $dp[u]=dp[u]-(dp[v]-size[v])$ and $dp[v]=dp[v]+(dp[u]+size[u])$.

```java
class Solution {
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
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the number of tree nodes. We only need to traverse nodes twice to get the answer, so the time complexity is $O(2n)=O(n)$.
- Space Complexity: $O(n)$. We have three arrays, dp, size and ans. The space complexity is $O(3n)=O(n)$.
