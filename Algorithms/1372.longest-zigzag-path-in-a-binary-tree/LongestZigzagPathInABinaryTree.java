/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class LongestZigzagPathInABinaryTree {
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