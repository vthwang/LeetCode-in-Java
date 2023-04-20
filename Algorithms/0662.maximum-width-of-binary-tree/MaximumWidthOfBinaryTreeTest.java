import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumWidthOfBinaryTreeTest {
    MaximumWidthOfBinaryTree maximumWidthOfBinaryTree = new MaximumWidthOfBinaryTree();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        Assertions.assertEquals(4, maximumWidthOfBinaryTree.widthOfBinaryTree(root));
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.right.right = new TreeNode(9);
        root.left.left.left = new TreeNode(6);
        root.right.right.left = new TreeNode(7);

        Assertions.assertEquals(7, maximumWidthOfBinaryTree.widthOfBinaryTree(root));
    }

    @Test
    void Example3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);

        Assertions.assertEquals(2, maximumWidthOfBinaryTree.widthOfBinaryTree(root));
    }
}
