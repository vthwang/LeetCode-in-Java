# [103. Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)

Given the `root` of a binary tree, return _the zigzag level order traversal of its nodes' values_. (i.e., from left to right, then right to left for the next level and alternate between).

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/02/19/tree1.jpg)

```
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
```

**Example 2:**

```
Input: root = [1]
Output: [[1]]
```

**Example 3:**

```
Input: root = []
Output: []
```

## Solutions
### [BFS](BinaryTreeZigzagLevelOrderTraversal.java)

Idea: Iterate all node using BFS and put same level nodes into list. According to our question,  we need to save list with zigzag way, which means push nodes into list from left at first, and next level is from right.

```java
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> nodeQueue = new ArrayDeque<>();
        nodeQueue.offer(root);
        boolean isOrderLeft = true;

        while (!nodeQueue.isEmpty()) {
            Deque<Integer> levelList = new LinkedList<>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = nodeQueue.poll();
                if (isOrderLeft)
                    levelList.offerLast(currNode.val);
                else
                    levelList.offerFirst(currNode.val);
                if (currNode.left != null)
                    nodeQueue.offer(currNode.left);
                if (currNode.right != null)
                    nodeQueue.offer(currNode.right);
            }
            res.add(new LinkedList<>(levelList));
            isOrderLeft = !isOrderLeft;
        }
        
        return res;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the nodes of binary tree.
- Space Complexity: $O(n)$.
