# [1254. Number of Closed Islands](https://leetcode.com/problems/number-of-closed-islands/)

Given a 2D `grid` consists of `0s` (land) and `1s` (water). An _island_ is a maximal 4-directionally connected group of `<font face="monospace">0</font>s` and a _closed island_ is an island **totally** (all left, top, right, bottom) surrounded by `1s.`

Return the number of _closed islands_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2019/10/31/sample_3_1610.png)

```
Input: grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0],[1,0,1,0,1,1,1,0],[1,0,0,0,0,1,0,1],[1,1,1,1,1,1,1,0]]
Output: 2
Explanation:
Islands in gray are closed because they are completely surrounded by water (group of 1s).
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2019/10/31/sample_4_1610.png)

```
Input: grid = [[0,0,1,0,0],[0,1,0,1,0],[0,1,1,1,0]]
Output: 1
```

**Example 3:**

```
Input: grid = [[1,1,1,1,1,1,1],
               [1,0,0,0,0,0,1],
               [1,0,1,1,1,0,1],
               [1,0,1,0,1,0,1],
               [1,0,1,1,1,0,1],
               [1,0,0,0,0,0,1],
               [1,1,1,1,1,1,1]]
Output: 2
```

## Solutions
### [DFS](NumberOfClosedIslands.java)

Idea: Use DFS to check the island is closed or not. In the DFS, iterate four direction of a land and use `&` operator with those island. If one of them doesn’t match the rule of closed island will return 0.

```java
class Solution {
    private int m, n;
    private int res = 0;
    private final int[] dx = {-1, 0, 1, 0};
    private final int[] dy = {0, 1, 0, -1};

    public int closedIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        if (m <= 2 || n <= 2) return 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (grid[i][j] == 0)
                    if (dfs(grid, i, j)) res++;
            }
        }

        return res;
    }

    private boolean dfs(int[][] grid, int x, int y) {
        if ((x == 0 || x == m - 1 || y == 0 || y == n - 1) && grid[x][y] == 0) {
            return false;
        }
        boolean f = true;
        grid[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int x1 = x + dx[i], y1 = y + dy[i];
            if (x1 < 0 || x1 >= m || y1 < 0 || y1 >= n || grid[x1][y1] == 1) continue;
            f = f & dfs(grid, x1, y1);
        }
        return f;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(m \times n)$.
- Space Complexity: $O(m \times n)$.
