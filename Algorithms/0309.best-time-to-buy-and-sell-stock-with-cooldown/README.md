# [309. Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/)

You are given an array `prices` where `prices[i]` is the price of a given stock on the `i<sup>th</sup>` day.

Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:

- After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).

**Note:** You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

**Example 1:**

```
Input: prices = [1,2,3,0,2]
Output: 3
Explanation: transactions = [buy, sell, cooldown, buy, sell]
```

**Example 2:**

```
Input: prices = [1]
Output: 0
```

## Solutions
### [Dynamic Programming](BestTimeToBuyAndSellStockWithCooldown.java)

Idea: We use $f[i][0]$ to represent the maximum profit while we have a stock. $f[i][1]$ represents the maximum profit while we don’t have any stock and also in cooldown. $f[i][2]$ represents the maximum profit while we don’t have any stock and not in cooldown.

For $f[i][0]$, the stock we have might be owned on day $i-1$. The correspond status is $f[i-1][0]$. Or the stock was bought on day $i$, then day $i-1$ can’t hold the stock and not in cooldown. The correspond status is $f[i-1][2] -prices[i]$. We bought a stock on day $i$ here, so we need to deduct it. The formula is $f[i][0]=\max(f[i-1][0],f[i-1][2]-prices[i])$

For $f[i][1]$, we’re in cooldown means we sold the stock on day $i$, so we must have a stock on day $i-1$. Also we sold it today with $prices[i]$. The formula is $f[i][1]=f[i-1][0]+prices[i]$.

For $f[i][2]$, we don’t have any stock on day $i$ and not in cooldown. It means we don’t have any operation in that day. It also means we don’t have any stock on day $i-1$. The formula is $f[i][2]=\max(f[i-1][1],f[i-1][2])$.

In the last day, it’s meaningless if we still own the stock, so we just need to find the maximum profit of not having the stock which is $\max(f[n-1][1],f[n-1][2])$.

The base cases of this dynamic programming are as following.

$$
\begin{cases}
f[0][0]=-prices[0] \\
f[0][1]=0 \\
f[0][2]=0
\end{cases}
$$

```java
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;

        int[][] f = new int[n][3];
        f[0][0] = -prices[0];
        for (int i = 1; i < n; i++) {
            f[i][0] = Math.max(f[i - 1][0], f[i - 1][2] - prices[i]);
            f[i][1] = f[i - 1][0] + prices[i];
            f[i][2] = Math.max(f[i - 1][1], f[i - 1][2]);
        }
        return Math.max(f[n - 1][1], f[n - 1][2]);
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of the prices array.
- Space Complexity: $O(n)$. We need $3n$ to save all of the status of dp. The space complexity is $O(n)$.

### [Optimized Dynamic Programming](BestTimeToBuyAndSellStockWithCooldown2.java)

Idea: $f[i][...]$ is only relevant with $f[i-1][...]$, so we can put the variables of $f[i-1][...]$ into three variables.

```java
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;

        int f0 = -prices[0];
        int f1 = 0, f2 = 0;
        for (int i = 1; i < n; i++) {
            int newF0 = Math.max(f0, f2 - prices[i]);
            int newF1 = f0 + prices[i];
            int newF2 = Math.max(f1, f2);
            f0 = newF0;
            f1 = newF1;
            f2 = newF2;
        }
        return Math.max(f1, f2);
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of the prices array.
- Space Complexity: $O(1)$.
