# [1770. Maximum Score from Performing Multiplication Operations](https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/)

You are given two integer arrays `nums` and `multipliers` of size `n` and `m` respectively, where `n >= m`. The arrays are **1-indexed**.

You begin with a score of `0`. You want to perform **exactly** `m` operations. On the `i<sup>th</sup>` operation **(1-indexed)**, you will:

- Choose one integer `x` from **either the start or the end** of the array `nums`.
- Add `multipliers[i] * x` to your score.
- Remove `x` from the array `nums`.

Return _the **maximum** score after performing_ `m` _operations._

**Example 1:**

```
Input: nums = [1,2,3], multipliers = [3,2,1]
Output: 14
Explanation: An optimal solution is as follows:
- Choose from the end, [1,2,<u>3</u>], adding 3 * 3 = 9 to the score.
- Choose from the end, [1,<u>2</u>], adding 2 * 2 = 4 to the score.
- Choose from the end, [<u>1</u>], adding 1 * 1 = 1 to the score.
The total score is 9 + 4 + 1 = 14.
```

**Example 2:**

```
Input: nums = [-5,-3,-3,-2,7,1], multipliers = [-10,-5,3,4,6]
Output: 102
Explanation: An optimal solution is as follows:
- Choose from the start, [<u>-5</u>,-3,-3,-2,7,1], adding -5 * -10 = 50 to the score.
- Choose from the start, [<u>-3</u>,-3,-2,7,1], adding -3 * -5 = 15 to the score.
- Choose from the start, [<u>-3</u>,-2,7,1], adding -3 * 3 = -9 to the score.
- Choose from the end, [-2,7,<u>1</u>], adding 1 * 4 = 4 to the score.
- Choose from the end, [-2,<u>7</u>], adding 7 * 6 = 42 to the score.
The total score is 50 + 15 - 9 + 4 + 42 = 102.
```

## Solutions
1. [Dynamic Programming](./MaximumScoreFromPerformingMultiplicationOperations.java)
    - Runtime: faster than 77.42%.
    - Memory usage: less than 78.68%.
