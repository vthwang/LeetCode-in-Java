import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PseudoPalindromicPathsInABinaryTreeTest {
    PseudoPalindromicPathsInABinaryTree PseudoPalindromicPathsInABinaryTree = new PseudoPalindromicPathsInABinaryTree();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.right = new TreeNode(1);
        int results = PseudoPalindromicPathsInABinaryTree.pseudoPalindromicPaths(root);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.right = new TreeNode(1);
        root.right = new TreeNode(1);
        int results = PseudoPalindromicPathsInABinaryTree.pseudoPalindromicPaths(root);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
