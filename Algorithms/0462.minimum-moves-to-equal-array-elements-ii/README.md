# [462. Minimum Moves to Equal Array Elements II](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/)

Given an integer array `nums` of size `n`, return _the minimum number of moves required to make all array elements equal_.

In one move, you can increment or decrement an element of the array by `1`.

Test cases are designed so that the answer will fit in a **32-bit** integer.

**Example 1:**

```
Input: nums = [1,2,3]
Output: 2
Explanation:
Only two moves are needed (remember each move increments or decrements one element):
[<u>1</u>,2,3]  =>  [2,2,<u>3</u>]  =>  [2,2,2]
```

**Example 2:**

```
Input: nums = [1,10,2,9]
Output: 16
```

## Solutions
1. [Array](./MinimumDeletionsToMakeCharacterFrequenciesUnique.java)
    - logic: find median.
    - Runtime: faster than 66.60%.
    - Memory usage: less than 8.60%
2. [Two pointers method](./MinimumDeletionsToMakeCharacterFrequenciesUnique.java)
    - logic: find median.
    - Runtime: faster than 98.32%.
    - Memory usage: less than 83.70%