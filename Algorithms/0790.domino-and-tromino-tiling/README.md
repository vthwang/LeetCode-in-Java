# [790. Domino and Tromino Tiling](https://leetcode.com/problems/domino-and-tromino-tiling/)

You have two types of tiles: a `2 x 1` domino shape and a tromino shape. You may rotate these shapes.

![](https://assets.leetcode.com/uploads/2021/07/15/lc-domino.jpg)

Given an integer n, return _the number of ways to tile an_ `2 x n` _board_. Since the answer may be very large, return it **modulo** `10<sup>9</sup> + 7`.

In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two 4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied by a tile.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/07/15/lc-domino1.jpg)

```
Input: n = 3
Output: 5
Explanation: The five different ways are show above.
```

**Example 2:**

```
Input: n = 1
Output: 1
```

## Solutions
### [Dynamic Programming](DominoAndTrominoTiling.java)

Idea: Suppose all of squares are covered by tile before $i$ column. There are four covering situations of $i$ column. If none of squares are covered, marked as 0. If upper square is covered, marked as 1. If lower square is covered, marked as 2. If all of squares of $i$ column are covered, marked as 3. Then, we can get the following formula.

$$
\begin{cases}
dp[i][0]=dp[i-1][3] \\
dp[i][1]=dp[i-1][0]+dp[i-1][2] \\
dp[i][2]=dp[i-1][0]+dp[i-1][1] \\
dp[i][3]=dp[i-1][0]+dp[i-1][1]+dp[i-1][2]+dp[i-1][3]
\end{cases}
$$

```java
class Solution {
    static final int modulo = 1000000007;

    public int numTilings(int n) {
        int[][] dp = new int[n + 1][4];
        dp[0][3] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i - 1][3];
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % modulo;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % modulo;
            dp[i][3] = (((dp[i - 1][0] + dp[i - 1][1]) % modulo + dp[i - 1][2]) % modulo + dp[i - 1][3]) % modulo;
        }
        return dp[n][3];
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the total columns.
- Space Complexity: $O(n)$. We use $4n$ to save DP array, so the space complexity is $O(4n)=O(n)$.
