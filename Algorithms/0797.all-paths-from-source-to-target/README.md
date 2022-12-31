# [797. All Paths From Source to Target](https://leetcode.com/problems/all-paths-from-source-to-target/)

Given a directed acyclic graph ( **DAG**) of `n` nodes labeled from `0` to `n - 1`, find all possible paths from node `0` to node `n - 1` and return them in **any order**.

The graph is given as follows: `graph[i]` is a list of all nodes you can visit from node `i` (i.e., there is a directed edge from node `i` to node `graph[i][j]`).

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/09/28/all_1.jpg)

```
Input: graph = [[1,2],[3],[3],[]]
Output: [[0,1,3],[0,2,3]]
Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/09/28/all_2.jpg)

```
Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
```

## Solutions
### [DFS](AllPathsFromSourceToTarget.java)

Idea: Iterate all nodes to find all paths. When we met the final nodes, we save the path to the answer list.

```java
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    Deque<Integer> stack = new ArrayDeque<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        stack.offerLast(0);
        dfs(graph, 0, graph.length - 1);
        return ans;
    }

    private void dfs(int[][] graph, int x, int n) {
        if (x == n) {
            ans.add(new ArrayList<>(stack));
            return;
        }
        for (int y : graph[x]) {
            stack.offerLast(y);
            dfs(graph, y, n);
            stack.pollLast();
        }
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n\times 2^n)$. $n$ is the number of nodes. The worst case scenario is every nodes can connect to all the larger nodes. The number of path is $O(2^n)$ and the path is $O(n)$. Thus, the total time complexity is $O(n\times 2^n)$.
- Space Complexity: $O(n)$. The stack costs $O(n)$.
