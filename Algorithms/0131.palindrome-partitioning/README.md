# [131. Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/)

Given a string `s`, partition `s` such that every substring of the partition is a **palindrome**. Return _all possible palindrome partitioning of_ `s`.

**Example 1:**

```
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
```

**Example 2:**

```
Input: s = "a"
Output: [["a"]]
```

## Solutions
### [Backtracking + Dynamic Programming](PalindromePartitioning.java)

Idea: We first use dynamic programming to deal with palindrome. If $i \ge j$, it’s an empty string or length equals 1, thus, it’s true by default. Otherwise, if the $i$ and $j$ character are the same and the string between them are palindrome, then it’s palindrome after add $i$ and $j$ as well. In the end, we use DFS and backtracking to iterate all results.

```java
class Solution {
    boolean[][] f;
    List<List<String>> ans  = new ArrayList<>();
    List<String> temp = new ArrayList<>();
    int n;

    public List<List<String>> partition(String s) {
        n = s.length();
        f = new boolean[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(f[i], true);
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                f[i][j] = (s.charAt(i) == s.charAt(j)) && f[i + 1][j - 1];
            }
        }

        dfs(s, 0);
        return ans;
    }

    private void dfs(String s, int i) {
        if (i == n) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int j = i; j < n; j++) {
            if (f[i][j]) {
                temp.add(s.substring(i, j + 1));
                dfs(s, j + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n\times2^n)$. $n$ is the length of s. In the worst case, s has completely same characters in $n$ length , and the time complexity is $O(n\times2^n)$.
- Space Complexity: $O(n^2)$. We use $O(n^2)$ for array f and use $O(n)$ in backtracking. The total space complexity is $O(n^2)$.
