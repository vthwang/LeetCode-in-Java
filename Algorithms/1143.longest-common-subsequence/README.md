# [1143. Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)

Given two strings `text1` and `text2`, return _the length of their longest **common subsequence**._ If there is no **common subsequence**, return `0`.

A **subsequence** of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

- For example, `"ace"` is a subsequence of `"abcde"`.

A **common subsequence** of two strings is a subsequence that is common to both strings.

**Example 1:**

```
Input: text1 = "abcde", text2 = "ace"
Output: 3
Explanation: The longest common subsequence is "ace" and its length is 3.
```

**Example 2:**

```
Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
```

**Example 3:**

```
Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.
```

## Solutions
### [Dynamic Programming](LongestCommonSubsequence.java)

Idea: We first consider the boundary situations. When i = 0 and j = 0, the length of the empty string and the longest common subsequence of any string is 0. Second, when `text1[ i - 1] = text2[j - 1]`, this two characters are common characters. Thus, `dp[i][j] = dp[i - 1][j - 1] + 1`. Otherwise, we get the greater one of the two previous strings which is `dp[i][j] = max(dp[i − 1][j],dp[i][j − 1])`.

```java
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            char c1 = text1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char c2 = text2.charAt(j - 1);
                if (c1 == c2)
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }
}
```

Complexity Analysis:

- Time Complexity: $O(mn)$. $m$ and $n$ are the length of text1 and text2 respectively.
- Space Complexity: $O(mn)$. we created an array for DP and the space complexity is $O(mn)$.
