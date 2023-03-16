# [129. Sum Root to Leaf Numbers](https://leetcode.com/problems/sum-root-to-leaf-numbers/)

You are given the `root` of a binary tree containing digits from `0` to `9` only.

Each root-to-leaf path in the tree represents a number.

- For example, the root-to-leaf path `1 -> 2 -> 3` represents the number `123`.

Return _the total sum of all root-to-leaf numbers_. Test cases are generated so that the answer will fit in a **32-bit** integer.

A **leaf** node is a node with no children.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/02/19/num1tree.jpg)

```
Input: root = [1,2,3]
Output: 25
Explanation:
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.
Therefore, sum = 12 + 13 = 25.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/02/19/num2tree.jpg)

```
Input: root = [4,9,0,5,1]
Output: 1026
Explanation:
The root-to-leaf path 4->9->5 represents the number 495.
The root-to-leaf path 4->9->1 represents the number 491.
The root-to-leaf path 4->0 represents the number 40.
Therefore, sum = 495 + 491 + 40 = 1026.
```

## Solutions
### [DFS](SumRootToLeafNumbers.java)

Idea: We first use DFS to find the numbers that we want to add together. Then, If we reach the leaves of the tree, we can add the current Number to total number which is `sum` in the code.

```java
class Solution {
    private int sum = 0;

    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode root, int currSum) {
        int tempSum = currSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum += tempSum;
            return;
        }
        if (root.left != null) {
            dfs(root.left, tempSum);
        }
        if (root.right != null) {
            dfs(root.right, tempSum);
        }
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the amount of nodes in the tree.
- Space Complexity: $O(n)$. Recursion is using stack and the space complexity is $O(n)$.
