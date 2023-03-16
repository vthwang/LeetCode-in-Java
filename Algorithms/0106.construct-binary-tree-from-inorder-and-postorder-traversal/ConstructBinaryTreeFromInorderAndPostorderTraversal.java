import java.util.HashMap;
import java.util.Map;

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
class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    int postIndex;
    int[] postorder;
    int[] inorder;
    Map<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        postIndex = postorder.length - 1;

        int index = 0;
        for (Integer val : inorder) {
            indexMap.put(val, index++);
        }

        return helper(0, inorder.length - 1);
    }

    private TreeNode helper(int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return null;
        }

        int rootVal = postorder[postIndex];
        TreeNode root = new TreeNode(rootVal);
        int index = indexMap.get(rootVal);

        postIndex--;
        root.right = helper(index + 1, rightIndex);
        root.left = helper(leftIndex, index - 1);
        return root;
    }
}