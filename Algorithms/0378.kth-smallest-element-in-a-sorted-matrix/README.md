# [378. Kth Smallest Element in a Sorted Matrix](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/)

Given an `n x n` `matrix` where each of the rows and columns is sorted in ascending order, return _the_ `k<sup>th</sup>` _smallest element in the matrix_.

Note that it is the `k<sup>th</sup>` smallest element **in the sorted order**, not the `k<sup>th</sup>` **distinct** element.

You must find a solution with a memory complexity better than `O(n<sup>2</sup>)`.

**Example 1:**

```
Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
Output: 13
Explanation: The elements in the matrix are [1,5,9,10,11,12,13,<u>13</u>,15], and the 8<sup>th</sup> smallest number is 13
```

**Example 2:**

```
Input: matrix = [[-5]], k = 1
Output: -5
```

## Solutions
1. [Binary Search](./KthSmallestElementInASortedMatrix.java)
    - Runtime: faster than 70.45%.
    - Memory usage: less than 30.70%.
2. [Heap](./KthSmallestElementInASortedMatrix2.java)
    - Runtime: faster than 11.83%.
    - Memory usage: less than 27.27%.