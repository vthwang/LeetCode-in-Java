import java.util.ArrayList;
import java.util.List;

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
class LeafSimilarTrees {
    private void dfs(TreeNode root, List<Integer> seq) {
        if (root.left == null && root.right == null)
            seq.add(root.val);
        else {
            if (root.left != null)
                dfs(root.left, seq);
            if (root.right != null)
                dfs(root.right, seq);
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> seq1 = new ArrayList<>();
        if (root1 != null)
            dfs(root1, seq1);

        List<Integer> seq2 = new ArrayList<>();
        if (root2 != null)
            dfs(root2, seq2);

        return seq1.equals(seq2);
    }
}