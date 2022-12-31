# [980. Unique Paths III](https://leetcode.com/problems/unique-paths-iii/)

You are given an `m x n` integer array `grid` where `grid[i][j]` could be:

- `1` representing the starting square. There is exactly one starting square.
- `2` representing the ending square. There is exactly one ending square.
- `0` representing empty squares we can walk over.
- `-1` representing obstacles that we cannot walk over.

Return _the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/08/02/lc-unique1.jpg)

```
Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,2,-1]]
Output: 2
Explanation: We have the following two paths:
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2)
2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2)
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/08/02/lc-unique2.jpg)

```
Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,0,2]]
Output: 4
Explanation: We have the following four paths:
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2),(2,3)
2. (0,0),(0,1),(1,1),(1,0),(2,0),(2,1),(2,2),(1,2),(0,2),(0,3),(1,3),(2,3)
3. (0,0),(1,0),(2,0),(2,1),(2,2),(1,2),(1,1),(0,1),(0,2),(0,3),(1,3),(2,3)
4. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2),(2,3)
```

**Example 3:**

![](https://assets.leetcode.com/uploads/2021/08/02/lc-unique3-.jpg)

```
Input: grid = [[0,1],[2,0]]
Output: 0
Explanation: There is no path that walks over every empty square exactly once.
Note that the starting and ending square can be anywhere in the grid.
```

## Solutions
### Backtracking

Idea: We first iterate all grids and find the start point and find the number of steps we can take. Then use backtracking and DFS iterates all possible path and change grid to -1 to indicate we already iterate that grid. Until the end, if it’s satisfy the final condition, add 1 to the answer. When the iteration is done, we change the grid to the original value for backtracking purpose.

```java
class Solution {
    int ans = 0;
    int[] start;
    int totalSteps = 0;

    public int uniquePathsIII(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    start = new int[]{i, j};
                else
                    if (grid[i][j] != -1)
                        totalSteps++;
            }
        }
        findPath(start[0], start[1], 0, grid);
        return ans;
    }

    private void findPath(int i, int j, int step, int[][] grid) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == -1)
            return;
        if (grid[i][j] == 2) {
            if (totalSteps == step)
                ans++;
        } else {
            int g = grid[i][j];
            grid[i][j] = -1;
            findPath(i + 1, j, step + 1, grid);
            findPath(i - 1, j, step + 1, grid);
            findPath(i, j + 1, step + 1, grid);
            findPath(i, j - 1, step + 1, grid);
            grid[i][j] = g;
        }
    }
}
```

Complexity Analysis:

- Time Complexity: $O(m\times n\times 2^{m\times n})$. The first iteration costs $O(m\times n)$. FindPath function costs $O(m\times n\times 4^{m\times n})$ because every grid has four directions and we have $m \times n$ grids. The total time complexity is $O(m\times n\times 2^{m\times n})$.
- Space Complexity: $O(m\times n\times 2^{m\times n})$. The space complexity is as same as the function time complexity because we put the same amount of recursion functions to the stack.
