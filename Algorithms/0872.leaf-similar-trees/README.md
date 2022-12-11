# [872. Leaf-Similar Trees](https://leetcode.com/problems/leaf-similar-trees/)

Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a **leaf value sequence** _._

![](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/16/tree.png)

For example, in the given tree above, the leaf value sequence is `(6, 7, 4, 9, 8)`.

Two binary trees are considered _leaf-similar_ if their leaf value sequence is the same.

Return `true` if and only if the two given trees with head nodes `root1` and `root2` are leaf-similar.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/09/03/leaf-similar-1.jpg)

```
Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/09/03/leaf-similar-2.jpg)

```
Input: root1 = [1,2,3], root2 = [1,3,2]
Output: false
```

## Solutions
### [DFS](./LeafSimilarTrees.java)

Idea: Use DFS to find the leaf and add to the list. After getting two trees leaf lists, compare them is equal or not.

```java
class Solution {
    private void dfs(TreeNode root, List<Integer> seq) {
        if (root.left == null && root.right == null)
            seq.add(root.val);
        else {
            if (root.left != null)
                dfs(root.left, seq);
            if (root.right != null)
                dfs(root.right, seq);
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> seq1 = new ArrayList<>();
        if (root1 != null)
            dfs(root1, seq1);

        List<Integer> seq2 = new ArrayList<>();
        if (root2 != null)
            dfs(root2, seq2);

        return seq1.equals(seq2);
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n_1+n_2)$. $n_1$ and $n_2$ are the number of nodes in the two trees respectively.
- Space Complexity: $O(n_1+n_2)$. Space complexity depends on the stack size of the recursion.
