# [653. Two Sum IV - Input is a BST](https://leetcode.com/problems/two-sum-iv-input-is-a-bst/)

Given the `root` of a Binary Search Tree and a target number `k`, return _`true` if there exist two elements in the BST such that their sum is equal to the given target_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/09/21/sum_tree_1.jpg)

```
Input: root = [5,3,6,2,4,null,7], k = 9
Output: true
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/09/21/sum_tree_2.jpg)

```
Input: root = [5,3,6,2,4,null,7], k = 28
Output: false
```

## Solutions
1. [Inorder](./TwoSumIvInputIsABst.java)
    - Use inorder to traverse the tree, and find the sum is equal to k.
    - Runtime: faster than 75.03%.
    - Memory usage: less than 54.77%.
