import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountGoodNodesInBinaryTreeTest {
    CountGoodNodesInBinaryTree CountGoodNodesInBinaryTree = new CountGoodNodesInBinaryTree();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        int results = CountGoodNodesInBinaryTree.goodNodes(root);
        int expectedResult = 4;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);

        int results = CountGoodNodesInBinaryTree.goodNodes(root);
        int expectedResult = 3;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example3() {
        TreeNode root = new TreeNode(1);

        int results = CountGoodNodesInBinaryTree.goodNodes(root);
        int expectedResult = 1;

        Assertions.assertEquals(expectedResult, results);
    }
}
