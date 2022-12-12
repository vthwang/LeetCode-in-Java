# [70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)

You are climbing a staircase. It takes `n` steps to reach the top.

Each time you can either climb `1` or `2` steps. In how many distinct ways can you climb to the top?

**Example 1:**

```
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
```

**Example 2:**

```
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
```

## Solutions
### [Dynamic Programming](./ClimbingStairs.java)

Idea: According to the question, we can conclude that $f(n)=f(n-1)+f(n-2)$, then we can use dynamic programming to get the answer.

```java
class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$.
- Space Complexity: $O(n)$. $n$ is the length of DP array.

### [Optimized Dynamic Programming](./ClimbingStairs2.java)

Idea: Don’t save DP result into array. Use three constant to save the result.

```java
class Solution {
    public int climbStairs(int n) {
        int p, q = 0, r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$.
- Space Complexity: $O(1)$.

### [Matrix Multiplication](./ClimbingStairs3.java)

Idea: $f_{n+1}=f_n+f_{n-1}$ can be written as matrix format $\begin{pmatrix}
f_n \\
f_{n-1}
\end{pmatrix} =
\begin{pmatrix}
1 & 1\\
1 & 0
\end{pmatrix}
\begin{pmatrix}
f_{n+1} \\
f_n
\end{pmatrix}$. We can get $\begin{pmatrix}
f_{n+1} \\
f_{n}
\end{pmatrix} =
M
\begin{pmatrix}
f_{n} \\
f_{n-1}
\end{pmatrix} =
M^2
\begin{pmatrix}
f_{n-1} \\
f_{n-2}
\end{pmatrix} =
... =
M^n
\begin{pmatrix}
f_1 \\
f_0
\end{pmatrix}$.  $M^n =
\begin{pmatrix}
m_{00} & m_{01} \\
m_{10} & m_{11}
\end{pmatrix}$. Then, as we defined, $f_0 = 0$ and $f_1 = 1$, we can get $f_{n+1}=m_{00}$.

```java
class Solution {
    public int climbStairs(int n) {
        int[][] q = {{1, 1}, {1, 0}};
        int[][] res = pow(q, n);
        return res[0][0];
    }

    private int[][] pow(int[][] a, int n) {
        int[][] ret = {{1, 0}, {0, 1}};
        while (n > 0) {
            if ((n & 1) == 1) {
                ret = multiply(ret, a);
            }
            n >>= 1;
            a = multiply(a, a);
        }
        return ret;
    }

    private int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }
        return c;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(\log^n)$.
- Space Complexity: $O(1)$.

### [General Formula for Recursive Series](./ClimbingStairs4.java)

Idea: Use math formula $f(n) = \frac{1}{\sqrt{5}}[(\frac{1 + \sqrt{5}}{2})^n-(\frac{1-\sqrt{5}}{2})^n]$.

```java
class Solution {
    public int climbStairs(int n) {
        double sqrt5 = Math.sqrt(5);
        double fibn = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
        return (int) Math.round(fibn / sqrt5);
    }
}
```

Complexity Analysis:

- Time Complexity: The time complexity is related to `pow` function. Can’t be analyzed.
- Space Complexity: $O(1)$.
