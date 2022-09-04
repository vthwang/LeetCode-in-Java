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
class VerticalOrderTraversalOfABinaryTree {
    Map<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map;

    private void dfs(TreeNode root, int index, int level) {
        if (root == null) return;
        map.putIfAbsent(index, new TreeMap<>());
        map.get(index).putIfAbsent(level, new PriorityQueue<>());
        map.get(index).get(level).add(root.val);
        dfs(root.left, index - 1, level + 1);
        dfs(root.right, index + 1, level + 1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null) return null;
        map = new TreeMap<>();
        dfs(root, 0, 0);
        List<List<Integer>> res = new LinkedList<>();
        for (int key : map.keySet()) {
            List<Integer> list = new LinkedList<>();
            TreeMap<Integer, PriorityQueue<Integer>> tm = map.get(key);
            for (int k : tm.keySet()) {
                PriorityQueue<Integer> pq = tm.get(k);
                while (!pq.isEmpty()) list.add(pq.poll());
            }
            res.add(list);
        }
        return res;
    }
}