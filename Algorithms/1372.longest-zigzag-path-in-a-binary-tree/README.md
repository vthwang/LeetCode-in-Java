# [1372. Longest ZigZag Path in a Binary Tree](https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/)

You are given the `root` of a binary tree.

A ZigZag path for a binary tree is defined as follow:

- Choose **any** node in the binary tree and a direction (right or left).
- If the current direction is right, move to the right child of the current node; otherwise, move to the left child.
- Change the direction from right to left or from left to right.
- Repeat the second and third steps until you can't move in the tree.

Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).

Return _the longest **ZigZag** path contained in that tree_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/01/22/sample_1_1702.png)

```
Input: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1]
Output: 3
Explanation: Longest ZigZag path in blue nodes (right -> left -> right).
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/01/22/sample_2_1702.png)

```
Input: root = [1,1,1,null,1,null,null,1,1,null,1]
Output: 4
Explanation: Longest ZigZag path in blue nodes (left -> right -> left -> right).
```

**Example 3:**

```
Input: root = [1]
Output: 0
```

## Solutions
### [DFS](LongestZigzagPathInABinaryTree.java)

Idea: We define that the direction left is false and right is true. Then iterate in zigzag way, if current direction is left, then if we go to left direction again, we reset length to 1.

```java
class Solution {
    int maxRes;

    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxRes = 0;
        dfs(root, true, 0);
        return maxRes;
    }

    private void dfs(TreeNode node, boolean dir, int len) {
        maxRes = Math.max(maxRes, len);
        if (!dir) {
            if (node.left != null) {
                dfs(node.left, true, len + 1);
            }
            if (node.right != null) {
                dfs(node.right, false, 1);
            }
        } else {
            if (node.left != null) {
                dfs(node.left, true, 1);
            }
            if (node.right != null) {
                dfs(node.right, false, len + 1);
            }
        }
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the amount of root nodes.
- Space Complexity: $O(1)$.
