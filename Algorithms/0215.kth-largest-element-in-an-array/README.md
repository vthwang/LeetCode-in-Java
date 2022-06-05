# [215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)

Given an integer array `nums` and an integer `k`, return _the_ `k<sup>th</sup>` _largest element in the array_.

Note that it is the `k<sup>th</sup>` largest element in the sorted order, not the `k<sup>th</sup>` distinct element.

**Example 1:**

```
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
```

**Example 2:**

```
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
```

## Solutions
1. [Sort](./KthLargestElementInAnArray.java)
    - Time complexity: O(NlogN)
    - Space complexity: O(1)
    - Runtime: faster than 78.33%.
    - Memory usage: less than 62.03%.
2. [Heap](./KthLargestElementInAnArray2.java)
    - Time complexity: O(NlogK)
    - Space complexity: O(K)
    - Runtime: faster than 78.33%.
    - Memory usage: less than 94.54%.
2. [Quick Select](./KthLargestElementInAnArray3.java)
    - Time complexity: O(N)
    - Space complexity: O(1)
    - Runtime: faster than 10.22%.
    - Memory usage: less than 55.02%.
