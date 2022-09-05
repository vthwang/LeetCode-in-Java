/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class NAryTreeLevelOrderTraversal2 {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) return res;
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> current = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                Node node = q.poll();
                current.add(node.val);
                if (node.children != null) q.addAll(node.children);
            }
            res.add(current);
        }
        return res;
    }
}