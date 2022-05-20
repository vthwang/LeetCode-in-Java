# [145. Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)

Given the `root` of a binary tree, return _the postorder traversal of its nodes' values_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/08/28/pre1.jpg)

```
Input: root = [1,null,2,3]
Output: [3,2,1]
```

**Example 2:**

```
Input: root = []
Output: []
```

**Example 3:**

```
Input: root = [1]
Output: [1]
```

## Solutions
1. [Stack](./BinaryTreePostorderTraversal.java)
    - Postorder sequence: left, right, root. We can traverse root, right, left and reverse it to postorder.
    - Runtime: faster than 43.59%.
    - Memory usage: less than 56.52%.
