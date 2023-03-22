# [2492. Minimum Score of a Path Between Two Cities](https://leetcode.com/problems/minimum-score-of-a-path-between-two-cities/)

You are given a positive integer `n` representing `n` cities numbered from `1` to `n`. You are also given a **2D** array `roads` where `roads[i] = [a<sub>i</sub>, b<sub>i</sub>, distance<sub>i</sub>]` indicates that there is a **bidirectional** road between cities `a<sub>i</sub>` and `b<sub>i</sub>` with a distance equal to `distance<sub>i</sub>`. The cities graph is not necessarily connected.

The **score** of a path between two cities is defined as the **minimum** distance of a road in this path.

Return _the **minimum** possible score of a path between cities_ `1` _and_ `n`.

**Note**:

- A path is a sequence of roads between two cities.
- It is allowed for a path to contain the same road **multiple** times, and you can visit cities `1` and `n` multiple times along the path.
- The test cases are generated such that there is **at least** one path between `1` and `n`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/10/12/graph11.png)

```
Input: n = 4, roads = [[1,2,9],[2,3,6],[2,4,5],[1,4,7]]
Output: 5
Explanation: The path from city 1 to 4 with the minimum score is: 1 -> 2 -> 4. The score of this path is min(9,5) = 5.
It can be shown that no other path has less score.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/10/12/graph22.png)

```
Input: n = 4, roads = [[1,2,2],[1,3,4],[3,4,7]]
Output: 2
Explanation: The path from city 1 to 4 with the minimum score is: 1 -> 2 -> 1 -> 3 -> 4. The score of this path is min(2,2,4,7) = 2.
```

## Solutions
### [DFS](MinimumScoreOfAPathBetweenTwoCities.java)

Idea: The question is asking the minimum path from 1 to n, we just need to find minimum path between any two nodes in a graph with 1 and n.

```java
class Solution {
    int res = Integer.MAX_VALUE;

    public int minScore(int n, int[][] roads) {
        List<List<int[]>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] road : roads) {
            int s = road[0] - 1;
            int d = road[1] - 1;
            int weight = road[2];
            list.get(s).add(new int[]{d, weight});
            list.get(d).add(new int[]{s, weight});
        }
        boolean[] visited = new boolean[n];
        dfs(list, 0, visited);
        return res;
    }

    private void dfs(List<List<int[]>> list, int start, boolean[] visited) {
        if (visited[start]) {
            return;
        }
        visited[start] = true;
        for (int[] next : list.get(start)) {
            if (res > next[1]) {
                res = next[1];
            }
            dfs(list, next[0], visited);
        }
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+m)$. $m$ is the length of the roads.
- Space Complexity: $O(n+m)$.
