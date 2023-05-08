# [1572. Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/)

Given a square matrix `mat`, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/08/14/sample_1911.png)

```
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
```

**Example 2:**

```
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
```

**Example 3:**

```
Input: mat = [[5]]
Output: 5
```

## Solutions
### [Iteration](MatrixDiagonalSum.java)

Idea: Iterate all diagonal values and remove the duplicate one while the array size is odd.

```java
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
        }
        for (int i = n - 1; i >= 0; i--) {
            sum += mat[i][n - 1 - i];
        }
        if (n % 2 == 0) {
            return sum;
        } else {
            int index = n / 2;
            sum -= mat[index][index];
        }
        return sum;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$.
- Space Complexity: $O(1)$.
