# [1. Two Sum](https://leetcode.com/problems/two-sum/)

Given an array of integers `nums` and an integer `target`, return _indices of the two numbers such that they add up to `target`_.

You may assume that each input would have **_exactly_ one solution**, and you may not use the _same_ element twice.

You can return the answer in any order.

**Example 1:**

```
<strong>Input:</strong> nums = [2,7,11,15], target = 9
<strong>Output:</strong> [0,1]
<strong>Explanation:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].

```

**Example 2:**

```
<strong>Input:</strong> nums = [3,2,4], target = 6
<strong>Output:</strong> [1,2]

```

**Example 3:**

```
<strong>Input:</strong> nums = [3,3], target = 6
<strong>Output:</strong> [0,1]

```

**Constraints:**

- `2 <= nums.length <= 10<sup>4</sup>`
- `-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup>`
- `-10<sup>9</sup> <= target <= 10<sup>9</sup>`
- **Only one valid answer exists.**

**Follow-up:** Can you come up with an algorithm that is less than `O(n<sup>2</sup>) ` time complexity?

## Possible Solutions

