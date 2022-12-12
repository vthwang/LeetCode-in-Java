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
class MaximumDifferenceBetweenNodeAndAncestor {
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