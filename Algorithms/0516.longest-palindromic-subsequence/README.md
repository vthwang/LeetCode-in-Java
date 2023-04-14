# [516. Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/)

Given a string `s`, find _the longest palindromic **subsequence**'s length in_ `s`.

A **subsequence** is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

**Example 1:**

```
Input: s = "bbbab"
Output: 4
Explanation: One possible longest palindromic subsequence is "bbbb".
```

**Example 2:**

```
Input: s = "cbbd"
Output: 2
Explanation: One possible longest palindromic subsequence is "bb".
```

## Solutions
### [Dynamic Programming](LongestPalindromicSubsequence.java)

Idea: Any length equals 1 can be the palindrome. If $s[i]=s[j]$, we can add character to the head and the tail of the current subsequence. Otherwise, if $s[i] \neq s[j]$, only one character can be added to the subsequence.

```java
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            char c1 = s.charAt(i);
            for (int j = i + 1; j < n; j++) {
                char c2 = s.charAt(j);
                if (c1 == c2) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n^2)$. $n$ is the length of `s`.
- Space Complexity: $O(n^2)$.
