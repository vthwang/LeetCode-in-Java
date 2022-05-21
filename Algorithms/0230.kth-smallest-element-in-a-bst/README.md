# [230. Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)

Given the `root` of a binary search tree, and an integer `k`, return _the_ `k<sup>th</sup>` _smallest value ( **1-indexed**) of all the values of the nodes in the tree_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/01/28/kthtree1.jpg)

```
Input: root = [3,1,4,null,2], k = 1
Output: 1
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/01/28/kthtree2.jpg)

```
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3
```

## Solutions
1. [Recursion](./KthSmallestElementInABst.java)
    - Runtime: faster than 100%.
    - Memory usage: less than 67.14%.
2. [Inorder](./KthSmallestElementInABst2.java)
    - Runtime: faster than 60.58%.
    - Memory usage: less than 36.69%.
