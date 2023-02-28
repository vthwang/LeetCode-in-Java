import java.util.*;


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
class FindDuplicateSubtrees {
    Map<String, Pair<TreeNode, Integer>> seen = new HashMap<>();
    Set<TreeNode> repeat = new HashSet<>();
    int idx = 0;

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return new ArrayList<>(repeat);
    }

    private int dfs(TreeNode node) {
        if (node == null)
            return 0;

        int[] tri = {node.val, dfs(node.left), dfs(node.right)};
        String hash = Arrays.toString(tri);
        if (seen.containsKey(hash)) {
            Pair<TreeNode, Integer> pair = seen.get(hash);
            repeat.add(pair.getKey());
            return pair.getValue();
        } else {
            seen.put(hash, new Pair<>(node, ++idx));
            return idx;
        }
    }
}