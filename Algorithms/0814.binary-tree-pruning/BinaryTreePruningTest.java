import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreePruningTest {
    BinaryTreePruning BinaryTreePruning = new BinaryTreePruning();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        TreeNode results = BinaryTreePruning.pruneTree(root);

        Assertions.assertNull(results.right.left);
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        TreeNode results = BinaryTreePruning.pruneTree(root);

        Assertions.assertNull(results.left);
        Assertions.assertNull(results.right.left);
    }

    @Test
    void Example3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        TreeNode results = BinaryTreePruning.pruneTree(root);

        Assertions.assertNull(results.left.left.left);
        Assertions.assertNull(results.right.left);
    }
}
