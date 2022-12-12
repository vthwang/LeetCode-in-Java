# [1026. Maximum Difference Between Node and Ancestor](https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/)

Given the `root` of a binary tree, find the maximum value `v` for which there exist **different** nodes `a` and `b` where `v = |a.val - b.val|` and `a` is an ancestor of `b`.

A node `a` is an ancestor of `b` if either: any child of `a` is equal to `b` or any child of `a` is an ancestor of `b`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/11/09/tmp-tree.jpg)

```
Input: root = [8,3,10,1,6,null,14,null,null,4,7,13]
Output: 7
Explanation: We have various ancestor-node differences, some of which are given below :
|8 - 3| = 5
|3 - 7| = 4
|8 - 1| = 7
|10 - 13| = 3
Among all possible differences, the maximum value of 7 is obtained by |8 - 1| = 7.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/11/09/tmp-tree-1.jpg)

```
Input: root = [1,null,2,null,0,3]
Output: 3
```

## Solutions
### [DFS](./MaximumDifferenceBetweenNodeAndAncestor.java)

Idea: Iterate all nodes and use max value and min value to minus current node to get the possible results, then return the largest result.

```java
class Solution {
    private int result = 0;

    public int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        dfs(root, root.val, root.val);
        return result;
    }

    private void dfs(TreeNode root, int currMax, int currMin) {
        if (root == null) return;
        int possibleResult = Math.max(Math.abs(currMax - root.val), Math.abs(root.val - currMin));
        result = Math.max(result, possibleResult);
        currMax = Math.max(currMax, root.val);
        currMin = Math.min(currMin, root.val);
        dfs(root.left, currMax, currMin);
        dfs(root.right, currMax, currMin);
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the number of nodes.
- Space Complexity: $O(n)$. Space complexity depends on the stack size of the recursion.

### [Optimized DFS](./MaximumDifferenceBetweenNodeAndAncestor2.java)

Idea: In the same path, we just need to get the max value and min value. Then return max value - min value.

```java
class Solution {
    public int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, root.val, root.val);
    }

    private int dfs(TreeNode root, int currMax, int currMin) {
        if (root == null) return currMax - currMin;
        currMax = Math.max(currMax, root.val);
        currMin = Math.min(currMin, root.val);
        int left = dfs(root.left, currMax, currMin);
        int right = dfs(root.right, currMax, currMin);
        return Math.max(left, right);
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the number of nodes.
- Space Complexity: $O(n)$. Space complexity depends on the stack size of the recursion.
