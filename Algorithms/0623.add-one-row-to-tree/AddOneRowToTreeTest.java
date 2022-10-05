import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddOneRowToTreeTest {
    AddOneRowToTree AddOneRowToTree = new AddOneRowToTree();

    @Test
    void Example1() {
        int val = 1, depth = 2;
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        TreeNode results = AddOneRowToTree.addOneRow(root, val, depth);

        Assertions.assertEquals(1, results.left.val);
        Assertions.assertEquals(1, results.right.val);
    }

    @Test
    void Example2() {
        int val = 1, depth = 3;
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        TreeNode results = AddOneRowToTree.addOneRow(root, val, depth);

        Assertions.assertEquals(1, results.left.left.val);
        Assertions.assertEquals(1, results.left.right.val);
    }
}
