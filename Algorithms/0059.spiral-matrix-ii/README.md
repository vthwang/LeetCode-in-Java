# [59. Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/)

Given a positive integer `n`, generate an `n x n` `matrix` filled with elements from `1` to `n<sup>2</sup>` in spiral order.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/11/13/spiraln.jpg)

```
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
```

**Example 2:**

```
Input: n = 1
Output: [[1]]
```

## Solutions
### [Simulation](SpiralMatrixIi.java)

Idea: Set the boundary, and iterate all places one by one.

```java
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int num = 1, target = n * n;
        while (num <= target) {
            for (int i = l; i <= r; i++) {
                res[t][i] = num++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                res[i][r] = num++;
            }
            r--;
            for (int i = r; i >= l; i--) {
                res[b][i] = num++;
            }
            b--;
            for (int i = b; i >= t; i--) {
                res[i][l] = num++;
            }
            l++;
        }
        return res;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n^2)$. It iterates $n^2$ size matrix, so the time complexity is $O(n^2)$.
- Space Complexity: $O(1)$.
