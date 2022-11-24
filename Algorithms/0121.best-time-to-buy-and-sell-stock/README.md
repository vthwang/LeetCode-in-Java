# [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

You are given an array `prices` where `prices[i]` is the price of a given stock on the `i<sup>th</sup>` day.

You want to maximize your profit by choosing a **single day** to buy one stock and choosing a **different day in the future** to sell that stock.

Return _the maximum profit you can achieve from this transaction_. If you cannot achieve any profit, return `0`.

**Example 1:**

```
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
```

**Example 2:**

```
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
```

## Solutions
### [Loop the Array once](./BestTimeToBuyAndSellStock.java)

Idea: We just record the lowest price when we meet one, then sell it while we found the profit is largest in the array. After we consider all days in the array, we get the maximum profit.

```java
class Solution {
   public int maxProfit(int[] prices) {
      int minPrice = Integer.MAX_VALUE, maxProfit = 0;
      for (int i = 0; i < prices.length; i++) {
         if (prices[i] < minPrice)
            minPrice = prices[i];
         else if (prices[i] - minPrice > maxProfit)
            maxProfit = prices[i] - minPrice;
      }
      return maxProfit;
   }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of prices.
- Space Complexity: $O(1)$. We only use extra space for variables.
