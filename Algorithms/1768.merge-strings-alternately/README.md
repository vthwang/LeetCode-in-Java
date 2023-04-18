# [1768. Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/)

You are given two strings `word1` and `word2`. Merge the strings by adding letters in alternating order, starting with `word1`. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return _the merged string._

**Example 1:**

```
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
```

**Example 2:**

```
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
```

**Example 3:**

```
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d
```

## Solutions
### [Two Pointers](MergeStringsAlternately.java)

Idea: Using two pointers to iterate the `word1` and the `word2`.

```java
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int i = 0, j = 0;
        StringBuilder res = new StringBuilder();
        while (i < n || j < m) {
            if (i < n) {
                res.append(word1.charAt(i++));
            }
            if (j < m) {
                res.append(word2.charAt(j++));
            }
        }
            
        return res.toString();
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+m)$. $n$ is the length of `word1` and $m$ is the length of `word2`.
- Space Complexity: $O(1)$.
