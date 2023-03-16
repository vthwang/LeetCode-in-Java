import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckCompletenessOfABinaryTreeTest {
    CheckCompletenessOfABinaryTree checkCompletenessOfABinaryTree = new CheckCompletenessOfABinaryTree();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        Assertions.assertTrue(checkCompletenessOfABinaryTree.isCompleteTree(root));
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);

        Assertions.assertFalse(checkCompletenessOfABinaryTree.isCompleteTree(root));
    }
}
