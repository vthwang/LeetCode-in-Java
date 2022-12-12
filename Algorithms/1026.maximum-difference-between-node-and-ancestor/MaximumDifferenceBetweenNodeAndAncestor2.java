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
class MaximumDifferenceBetweenNodeAndAncestor2 {
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