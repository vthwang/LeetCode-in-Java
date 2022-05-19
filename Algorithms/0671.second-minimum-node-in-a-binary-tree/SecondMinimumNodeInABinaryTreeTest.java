import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondMinimumNodeInABinaryTreeTest {
    SecondMinimumNodeInABinaryTree SecondMinimumNodeInABinaryTree = new SecondMinimumNodeInABinaryTree();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(2);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(5);
        TreeNode forthNode = new TreeNode(5);
        TreeNode fifthNode = new TreeNode(7);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        thirdNode.left = forthNode;
        thirdNode.right = fifthNode;

        int results = SecondMinimumNodeInABinaryTree.findSecondMinimumValue(firstNode);
        int expectedResult = 5;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(2);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(2);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;

        int results = SecondMinimumNodeInABinaryTree.findSecondMinimumValue(firstNode);
        int expectedResult = -1;

        Assertions.assertEquals(expectedResult, results);
    }
}
