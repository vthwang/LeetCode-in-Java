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
class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> nodeQueue = new ArrayDeque<>();
        nodeQueue.offer(root);
        boolean isOrderLeft = true;

        while (!nodeQueue.isEmpty()) {
            Deque<Integer> levelList = new LinkedList<>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = nodeQueue.poll();
                if (isOrderLeft)
                    levelList.offerLast(currNode.val);
                else
                    levelList.offerFirst(currNode.val);
                if (currNode.left != null)
                    nodeQueue.offer(currNode.left);
                if (currNode.right != null)
                    nodeQueue.offer(currNode.right);
            }
            res.add(new LinkedList<>(levelList));
            isOrderLeft = !isOrderLeft;
        }

        return res;
    }
}