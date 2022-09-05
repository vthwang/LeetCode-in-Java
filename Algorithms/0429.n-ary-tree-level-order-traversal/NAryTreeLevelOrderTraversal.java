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

import java.util.ArrayList;
import java.util.List;

class NAryTreeLevelOrderTraversal {
    private final List<List<Integer>> res = new ArrayList<>();

    private void BFS(Node root, int level) {
        if (root == null) return;
        List<Integer> levelList;
        if (res.size() < level + 1) {
            levelList = new ArrayList<>();
            levelList.add(root.val);
            res.add(levelList);
        } else {
            levelList = res.get(level);
            levelList.add(root.val);
            res.remove(level);
            res.add(level, levelList);
        }
        if (root.children != null) {
            for (Node node : root.children) {
                BFS(node, level + 1);
            }
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        BFS(root, 0);
        return res;
    }
}