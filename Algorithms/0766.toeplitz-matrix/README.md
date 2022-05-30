# [766. Toeplitz Matrix](https://leetcode.com/problems/toeplitz-matrix/)

Given an `m x n` `matrix`, return _`true` if the matrix is Toeplitz. Otherwise, return `false`._

A matrix is **Toeplitz** if every diagonal from top-left to bottom-right has the same elements.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/11/04/ex1.jpg)

```
Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
Output: true
Explanation:
In the above grid, the diagonals are:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
In each diagonal all elements are the same, so the answer is True.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/11/04/ex2.jpg)

```
Input: matrix = [[1,2],[2,2]]
Output: false
Explanation:
The diagonal "[1, 2]" has different elements.
```

## Solutions
1. [Recursion](./ToeplitzMatrix.java)
    - Runtime: faster than 26.73%.
    - Memory usage: less than 36.96%
