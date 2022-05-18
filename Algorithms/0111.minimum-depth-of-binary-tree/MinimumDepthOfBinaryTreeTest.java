import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumDepthOfBinaryTreeTest {
    MinimumDepthOfBinaryTree MinimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(3);
        TreeNode secondNode = new TreeNode(9);
        TreeNode thirdNode = new TreeNode(20);
        TreeNode forthNode = new TreeNode(15);
        TreeNode fifthNode = new TreeNode(7);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        thirdNode.left = forthNode;
        thirdNode.right = fifthNode;

        int results = MinimumDepthOfBinaryTree.minDepth(firstNode);
        int expectedResult = 2;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(2);
        TreeNode secondNode = new TreeNode(3);
        TreeNode thirdNode = new TreeNode(4);
        TreeNode forthNode = new TreeNode(5);
        TreeNode fifthNode = new TreeNode(6);

        firstNode.right = secondNode;
        secondNode.right = thirdNode;
        thirdNode.right = forthNode;
        forthNode.right = fifthNode;

        int results = MinimumDepthOfBinaryTree.minDepth(firstNode);
        int expectedResult = 5;

        Assertions.assertEquals(expectedResult, results);
    }
}
