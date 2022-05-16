import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {
    InvertBinaryTree InvertBinaryTree = new InvertBinaryTree();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(4);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(7);
        TreeNode forthNode = new TreeNode(1);
        TreeNode fifthNode = new TreeNode(3);
        TreeNode sixthNode = new TreeNode(6);
        TreeNode seventhNode = new TreeNode(9);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        thirdNode.left = sixthNode;
        thirdNode.right = seventhNode;

        TreeNode results = InvertBinaryTree.invertTree(firstNode);

        firstNode.left = thirdNode;
        firstNode.right = secondNode;
        thirdNode.left = seventhNode;
        thirdNode.right = sixthNode;
        secondNode.left = fifthNode;
        secondNode.right = forthNode;

        Assertions.assertEquals(firstNode, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(2);
        TreeNode secondNode = new TreeNode(1);
        TreeNode thirdNode = new TreeNode(3);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;

        TreeNode results = InvertBinaryTree.invertTree(firstNode);

        firstNode.left = thirdNode;
        firstNode.right = secondNode;

        Assertions.assertEquals(firstNode, results);
    }

    @Test
    void Example3() {
        TreeNode results = InvertBinaryTree.invertTree(null);

        Assertions.assertNull(results);
    }
}
