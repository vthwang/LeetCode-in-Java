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
class CountGoodNodesInBinaryTree {
    private int count = 0;

    private void goodNodes(TreeNode root, int maxValue) {
        if (root == null) return;
        if (maxValue <= root.val) {
            count++;
            maxValue = root.val;
        }
        goodNodes(root.left, maxValue);
        goodNodes(root.right, maxValue);
    }

    public int goodNodes(TreeNode root) {
        goodNodes(root, root.val);
        return count;
    }
}