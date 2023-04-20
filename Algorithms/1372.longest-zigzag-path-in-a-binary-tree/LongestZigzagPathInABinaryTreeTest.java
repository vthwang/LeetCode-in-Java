import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestZigzagPathInABinaryTreeTest {
    LongestZigzagPathInABinaryTree longestZigzagPathInABinaryTree = new LongestZigzagPathInABinaryTree();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        root.right.right.left = new TreeNode(1);
        root.right.right.right = new TreeNode(1);
        root.right.right.left.right = new TreeNode(1);
        root.right.right.left.right.right = new TreeNode(1);

        Assertions.assertEquals(3, longestZigzagPathInABinaryTree.longestZigZag(root));
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(1);
        root.left.right.left.right = new TreeNode(1);

        Assertions.assertEquals(4, longestZigzagPathInABinaryTree.longestZigZag(root));
    }

    @Test
    void Example3() {
        TreeNode root = new TreeNode(1);

        Assertions.assertEquals(0, longestZigzagPathInABinaryTree.longestZigZag(root));
    }
}
