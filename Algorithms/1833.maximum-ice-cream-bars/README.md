# [1833. Maximum Ice Cream Bars](https://leetcode.com/problems/maximum-ice-cream-bars/)

It is a sweltering summer day, and a boy wants to buy some ice cream bars.

At the store, there are `n` ice cream bars. You are given an array `costs` of length `n`, where `costs[i]` is the price of the `i<sup>th</sup>` ice cream bar in coins. The boy initially has `coins` coins to spend, and he wants to buy as many ice cream bars as possible.

Return _the **maximum** number of ice cream bars the boy can buy with_ `coins` _coins._

**Note:** The boy can buy the ice cream bars in any order.

**Example 1:**

```
Input: costs = [1,3,2,4,1], coins = 7
Output: 4
Explanation: The boy can buy ice cream bars at indices 0,1,2,4 for a total price of 1 + 3 + 2 + 1 = 7.
```

**Example 2:**

```
Input: costs = [10,6,8,7,7,8], coins = 5
Output: 0
Explanation: The boy cannot afford any of the ice cream bars.
```

**Example 3:**

```
Input: costs = [1,6,3,1,2,5], coins = 20
Output: 6
Explanation: The boy can buy all the ice cream bars for a total price of 1 + 6 + 3 + 1 + 2 + 5 = 18.
```

## Solutions
### [Sorting + Greedy](MaximumIceCreamBars.java)

Idea: Intuitively, we can sort costs and remove items until coin are spent.

```java
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = costs.length;
        for (int i = 0; i < n; i++) {
            if (costs[i] > coins)
                return i;
            coins -= costs[i];
        }
        return n;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n\log n)$. $n$ is the length of costs. The time complexity of sorting is $O(n\log n)$ and the iteration is $O(n)$. The total time complexity is $O(n\log n)$.
- Space Complexity: $O(\log n)$. The space complexity of sorting is $O(\log n)$.

### [Counting + Greedy](MaximumIceCreamBars2.java)

Idea: Use an array with limit size $10^5$ to save the same price ice cream. Then, iterate all possible prices to find how many ice creams the boy can bought.

```java
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] freq = new int[100001];
        for (int i = 0; i < costs.length; i++)
            freq[costs[i]]++;
        int ans = 0;
        for (int i = 1; i <= 100000; i++) {
            if (coins >= i) {
                int currCount = Math.min(freq[i], coins / i);
                ans += currCount;
                coins -= currCount * i;
            } else
                break;
        }
        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+C)$. $n$ is the length of costs. We use two iterations here, one is $n$ and the other is $C$ which is $10^5$ in this question. The total time complexity is $O(n+C)$.
- Space Complexity: $O(C)$. The length of freq array is $C$ which is $10^5$, so the total space complexity is $O(C)$.
