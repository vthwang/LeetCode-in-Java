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
class ConvertSortedArrayToBinarySearchTree {
    private TreeNode toBST(int[] nums, int sIdx, int eIdx) {
        if (sIdx > eIdx) return null;
        int mIdx = (sIdx + eIdx) / 2;
        TreeNode root = new TreeNode(nums[mIdx]);
        root.left = toBST(nums, sIdx, mIdx - 1);
        root.right = toBST(nums, mIdx + 1, eIdx);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length - 1);
    }
}