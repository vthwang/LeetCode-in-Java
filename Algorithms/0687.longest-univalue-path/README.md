# [687. Longest Univalue Path](https://leetcode.com/problems/longest-univalue-path/)

Given the `root` of a binary tree, return _the length of the longest path, where each node in the path has the same value_. This path may or may not pass through the root.

**The length of the path** between two nodes is represented by the number of edges between them.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/10/13/ex1.jpg)

```
Input: root = [5,4,5,1,1,5]
Output: 2
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/10/13/ex2.jpg)

```
Input: root = [1,4,5,4,4,5]
Output: 2
```

## Solutions
1. [Recursion](./LongestUnivaluePath.java)
    - Using Deepest First Search(DFS)
    - Runtime: faster than 35.34%.
    - Memory usage: less than 35.26%.
