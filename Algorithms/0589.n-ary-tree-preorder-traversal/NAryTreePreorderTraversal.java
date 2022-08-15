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

class NAryTreePreorderTraversal {
    private final List<Integer> res = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) return res;
        res.add(root.val);
        if (root.children == null) return res;
        for (int i = 0; i < root.children.size(); i++) {
            preorder(root.children.get(i));
        }

        return res;
    }
}