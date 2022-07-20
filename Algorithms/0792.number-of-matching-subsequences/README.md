# [792. Number of Matching Subsequences](https://leetcode.com/problems/number-of-matching-subsequences/)

Given a string `s` and an array of strings `words`, return _the number of_ `words[i]` _that is a subsequence of_ `s`.

A **subsequence** of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

- For example, `"ace"` is a subsequence of `"abcde"`.

**Example 1:**

```
Input: s = "abcde", words = ["a","bb","acd","ace"]
Output: 3
Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".
```

**Example 2:**

```
Input: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
Output: 2
```

## Solutions
1. [HashMap](./NumberOfMatchingSubsequences.java)
    - Runtime: faster than 15.00%.
    - Memory usage: less than 33.31%.
2. [BinarySearch](./NumberOfMatchingSubsequences2.java)
    - Runtime: faster than 14.23%.
    - Memory usage: less than 54.58%.
