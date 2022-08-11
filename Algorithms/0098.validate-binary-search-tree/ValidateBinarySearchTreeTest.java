import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateBinarySearchTreeTest {
    ValidateBinarySearchTree ValidateBinarySearchTree = new ValidateBinarySearchTree();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        boolean results = ValidateBinarySearchTree.isValidBST(root);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        boolean results = ValidateBinarySearchTree.isValidBST(root);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        boolean results = ValidateBinarySearchTree.isValidBST(root);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);
        boolean results = ValidateBinarySearchTree.isValidBST(root);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example5() {
        TreeNode root = new TreeNode(2147483647);
        boolean results = ValidateBinarySearchTree.isValidBST(root);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }
}
