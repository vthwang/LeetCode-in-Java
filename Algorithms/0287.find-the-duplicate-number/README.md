# [287. Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/)

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only **one repeated number** in `nums`, return _this repeated number_.

You must solve the problem **without** modifying the array `nums` and uses only constant extra space.

**Example 1:**

```
Input: nums = [1,3,4,2,2]
Output: 2
```

**Example 2:**

```
Input: nums = [3,1,3,4,2]
Output: 3
```

## Solutions
1. [Binary Search](./FindTheDuplicateNumber.java)
    - Runtime: faster than 30.29%.
    - Memory usage: less than 37.83%.
2. [Two pointers method](./FindTheDuplicateNumber2.java)
    - Runtime: faster than 79.89%.
    - Memory usage: less than 46.60%.