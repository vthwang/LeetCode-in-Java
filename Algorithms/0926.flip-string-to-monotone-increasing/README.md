# [926. Flip String to Monotone Increasing](https://leetcode.com/problems/flip-string-to-monotone-increasing/)

A binary string is monotone increasing if it consists of some number of `0`'s (possibly none), followed by some number of `1`'s (also possibly none).

You are given a binary string `s`. You can flip `s[i]` changing it from `0` to `1` or from `1` to `0`.

Return _the minimum number of flips to make_ `s` _monotone increasing_.

**Example 1:**

```
Input: s = "00110"
Output: 1
Explanation: We flip the last digit to get 00111.
```

**Example 2:**

```
Input: s = "010110"
Output: 2
Explanation: We flip to get 011111, or alternatively 000111.
```

**Example 3:**

```
Input: s = "00011000"
Output: 2
Explanation: We flip to get 00000000.
```

## Solutions
### [Dynamic Programming](FlipStringToMonotoneIncreasing.java)

Idea: If the current number is 1, the previous number can be 0 and 1. However, if the current number is 0, the previous number can only be 0. Thus, when the current number is 1, we need to add 1 to dp0 because we want to flip this number to 0, and vice versa. In the last step, the minimum number of dp0 and dp1 is the least number of flipping string to monotone increasing.

```java
class Solution {
    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int dp0 = 0, dp1 = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int dp0New = dp0, dp1New = Math.min(dp0, dp1);
            if (c == '1')
                dp0New++;
            else
                dp1New++;
            dp0 = dp0New;
            dp1 = dp1New;
        }
        return Math.min(dp0, dp1);
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of s.
- Space Complexity: $O(1)$. Only use constant variables here, so the total space complexity is $O(1)$.
