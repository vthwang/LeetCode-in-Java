# [338. Counting Bits](https://leetcode.com/problems/counting-bits/)

Given an integer `n`, return _an array_ `ans` _of length_ `n + 1` _such that for each_ `i`( `0 <= i <= n`) _,_ `ans[i]` _is the **number of**_ `1` _**'s** in the binary representation of_ `i`.

**Example 1:**

```
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
```

**Example 2:**

```
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
```

## Solutions
1. [Bitwise Operator](./CountingBits.java)
    - Runtime: faster than 99.94%.
    - Memory usage: less than 89.56%
