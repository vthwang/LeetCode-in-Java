# [783. Minimum Distance Between BST Nodes](https://leetcode.com/problems/minimum-distance-between-bst-nodes/)

Given the `root` of a Binary Search Tree (BST), return _the minimum difference between the values of any two different nodes in the tree_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/02/05/bst1.jpg)

```
Input: root = [4,2,6,1,3]
Output: 1
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/02/05/bst2.jpg)

```
Input: root = [1,0,48,null,null,12,49]
Output: 1
```

## Solutions
### [DFS](MinimumDistanceBetweenBstNodes.java)

Idea: Use In-order traversal to get the minimum differences between nodes.

```java
class Solution {
    int ans, pre;

    public int minDiffInBST(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;

        dfs(root.left);
        if (pre != -1) {
            ans = Math.min(ans, root.val - pre);
        }
        pre = root.val;
        dfs(root.right);
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the nodes of tree.
- Space Complexity: $O(n)$.
