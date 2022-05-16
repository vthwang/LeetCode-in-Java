import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedBinaryTreeTest {
    BalancedBinaryTree BalancedBinaryTree = new BalancedBinaryTree();

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

        boolean expectedResult = true;
        boolean results = BalancedBinaryTree.isBalanced(firstNode);

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(2);
        TreeNode forthNode = new TreeNode(3);
        TreeNode fifthNode = new TreeNode(3);
        TreeNode sixthNode = new TreeNode(4);
        TreeNode seventhNode = new TreeNode(4);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        forthNode.left = sixthNode;
        forthNode.right = seventhNode;

        boolean expectedResult = false;
        boolean results = BalancedBinaryTree.isBalanced(firstNode);

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example3() {
        boolean expectedResult = true;
        boolean results = BalancedBinaryTree.isBalanced(null);

        Assertions.assertEquals(expectedResult, results);
    }
}
