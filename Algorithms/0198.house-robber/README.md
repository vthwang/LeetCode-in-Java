# [198. House Robber](https://leetcode.com/problems/house-robber/)

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and **it will automatically contact the police if two adjacent houses were broken into on the same night**.

Given an integer array `nums` representing the amount of money of each house, return _the maximum amount of money you can rob tonight **without alerting the police**_.

**Example 1:**

```
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
```

**Example 2:**

```
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.
```

## Solutions
### [Dynamic Programming](./HouseRobber.java)

Idea: If the number of houses is greater than 0, we can steal the $i$ house and $i-2$ house at the same time, or we don’t steal $i$ house but steal $i-1$ house. The formula is `dp[i] = max(dp[i - 2]+ nums[i], dp[i -1])`. However, there are two edge cases. First, if there is one house, steal it. Second, if there are only two houses, steal the greater value one.

```java
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++)
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        
        return dp[n - 1];
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `nums`.
- Space Complexity: $O(n)$. We use extra array to save DP value, the space complexity is $O(n)$.

### [Optimized Dynamic Programming](./HouseRobber2.java)

Idea: The final number is only related with the previous two houses, we can use two integers to replace DP array.

```java
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `nums`.
- Space Complexity: $O(1)$.
