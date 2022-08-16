# [567. Permutation in String](https://leetcode.com/problems/permutation-in-string/)

Given two strings `s1` and `s2`, return `true` _if_ `s2` _contains a permutation of_ `s1` _, or_ `false` _otherwise_.

In other words, return `true` if one of `s1`'s permutations is the substring of `s2`.

**Example 1:**

```
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
```

**Example 2:**

```
Input: s1 = "ab", s2 = "eidboaoo"
Output: false
```

## Solutions
1. [Sliding Window](./PermutationInString.java)
    - Runtime: faster than 52.39%.
    - Memory usage: less than 92.47%.
