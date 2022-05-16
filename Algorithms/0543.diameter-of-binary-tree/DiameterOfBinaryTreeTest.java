import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiameterOfBinaryTreeTest {
    DiameterOfBinaryTree DiameterOfBinaryTree = new DiameterOfBinaryTree();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(3);
        TreeNode forthNode = new TreeNode(4);
        TreeNode fifthNode = new TreeNode(5);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;

        int expectedResult = 3;
        int results = DiameterOfBinaryTree.diameterOfBinaryTree(firstNode);

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(1);
        firstNode.left = new TreeNode(2);

        int expectedResult = 1;
        int results = DiameterOfBinaryTree.diameterOfBinaryTree(firstNode);

        Assertions.assertEquals(expectedResult, results);
    }
}
