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
class KthSmallestElementInABst {
    private int count(TreeNode node) {
        if (node == null) return 0;
        return 1 + count(node.left) + count(node.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        int leftCnt = count(root.left);
        if (leftCnt == k - 1) return root.val;
        if (leftCnt > k - 1) return kthSmallest(root.left, k);
        return kthSmallest(root.right, k - leftCnt - 1);
    }
}