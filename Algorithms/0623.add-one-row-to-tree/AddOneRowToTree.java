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
class AddOneRowToTree {
    private void InsertRow(TreeNode root, int val, int depth) {
        if (root == null) return;
        if (depth == 0) {
            TreeNode leftNode = root.left;
            TreeNode rightNode = root.right;
            root.left = new TreeNode(val);
            root.right = new TreeNode(val);
            root.left.left = leftNode;
            root.right.right = rightNode;
        } else {
            InsertRow(root.left, val, depth - 1);
            InsertRow(root.right, val, depth - 1);
        }
    }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode res = new TreeNode(val);
            res.left = root;
            return res;
        }
        InsertRow(root, val, depth - 2);
        return root;
    }
}