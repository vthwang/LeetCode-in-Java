# [473. Matchsticks to Square](https://leetcode.com/problems/matchsticks-to-square/)

You are given an integer array `matchsticks` where `matchsticks[i]` is the length of the `i<sup>th</sup>` matchstick. You want to use **all the matchsticks** to make one square. You **should not break** any stick, but you can link them up, and each matchstick must be used **exactly one time**.

Return `true` if you can make this square and `false` otherwise.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/04/09/matchsticks1-grid.jpg)

```
Input: matchsticks = [1,1,2,2,2]
Output: true
Explanation: You can form a square with length 2, one side of the square came two sticks with length 1.
```

**Example 2:**

```
Input: matchsticks = [3,3,3,3,4]
Output: false
Explanation: You cannot find a way to form a square with all the matchsticks.
```

## Solutions
1. [DFS](./MatchsticksToSquare.java)
    - Runtime: faster than 59.20%.
    - Memory usage: less than 89.51%.
