import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDepthOfBinaryTreeTest {
    MaximumDepthOfBinaryTree MaximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

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

        int expectedResult = 3;
        int results = MaximumDepthOfBinaryTree.maxDepth(firstNode);

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(1);
        firstNode.right = new TreeNode(2);

        int expectedResult = 2;
        int results = MaximumDepthOfBinaryTree.maxDepth(firstNode);

        Assertions.assertEquals(expectedResult, results);
    }
}
