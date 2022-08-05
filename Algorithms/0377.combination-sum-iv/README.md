# [377. Combination Sum IV](https://leetcode.com/problems/combination-sum-iv/)

Given an array of **distinct** integers `nums` and a target integer `target`, return _the number of possible combinations that add up to_ `target`.

The test cases are generated so that the answer can fit in a **32-bit** integer.

**Example 1:**

```
Input: nums = [1,2,3], target = 4
Output: 7
Explanation:
The possible combination ways are:
(1, 1, 1, 1)
(1, 1, 2)
(1, 2, 1)
(1, 3)
(2, 1, 1)
(2, 2)
(3, 1)
Note that different sequences are counted as different combinations.
```

**Example 2:**

```
Input: nums = [9], target = 3
Output: 0
```

## Solutions
1. [Dynamic Programming - HashMap](./CombinationSumIv.java)
    - Runtime: faster than 5.84%.
    - Memory usage: less than 5.59%
2. [Dynamic Programming - Array](./CombinationSumIv2.java)
   - Runtime: faster than 100%.
   - Memory usage: less than 93.06%
