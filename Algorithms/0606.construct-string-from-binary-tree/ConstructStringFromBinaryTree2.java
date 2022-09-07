import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

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
class ConstructStringFromBinaryTree2 {
    public String tree2str(TreeNode root) {
        if (root == null) return "";
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        Set<TreeNode> visited = new HashSet<>();
        StringBuilder s = new StringBuilder();
        while (!stack.empty()) {
            root = stack.peek();
            if (visited.contains(root)) {
                stack.pop();
                s.append(")");
            } else {
                visited.add(root);
                s.append("(" + root.val);
                if (root.left == null && root.right != null) s.append("()");
                if (root.right != null) stack.push(root.right);
                if (root.left != null) stack.push(root.left);
            }
        }
        return s.substring(1, s.length() - 1);
    }
}