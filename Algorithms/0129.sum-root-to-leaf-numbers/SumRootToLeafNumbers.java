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
class SumRootToLeafNumbers {
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