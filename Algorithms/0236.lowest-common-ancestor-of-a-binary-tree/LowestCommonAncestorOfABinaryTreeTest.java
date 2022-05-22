import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LowestCommonAncestorOfABinaryTreeTest {
    LowestCommonAncestorOfABinaryTree LowestCommonAncestorOfABinaryTree = new LowestCommonAncestorOfABinaryTree();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(3);
        TreeNode secondNode = new TreeNode(5);
        TreeNode thirdNode = new TreeNode(1);
        TreeNode forthNode = new TreeNode(6);
        TreeNode fifthNode = new TreeNode(2);
        TreeNode sixthNode = new TreeNode(0);
        TreeNode seventhNode = new TreeNode(8);
        TreeNode eighthNode = new TreeNode(7);
        TreeNode ninthNode = new TreeNode(4);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        thirdNode.left = sixthNode;
        thirdNode.right = seventhNode;
        fifthNode.left =eighthNode;
        fifthNode.right = ninthNode;

        TreeNode results = LowestCommonAncestorOfABinaryTree.lowestCommonAncestor(firstNode, secondNode, thirdNode);
        Assertions.assertEquals(3, results.val);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(3);
        TreeNode secondNode = new TreeNode(5);
        TreeNode thirdNode = new TreeNode(1);
        TreeNode forthNode = new TreeNode(6);
        TreeNode fifthNode = new TreeNode(2);
        TreeNode sixthNode = new TreeNode(0);
        TreeNode seventhNode = new TreeNode(8);
        TreeNode eighthNode = new TreeNode(7);
        TreeNode ninthNode = new TreeNode(4);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        thirdNode.left = sixthNode;
        thirdNode.right = seventhNode;
        fifthNode.left =eighthNode;
        fifthNode.right = ninthNode;

        TreeNode results = LowestCommonAncestorOfABinaryTree.lowestCommonAncestor(firstNode, secondNode, ninthNode);
        Assertions.assertEquals(5, results.val);
    }

    @Test
    void Example3() {
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(2);

        firstNode.left = secondNode;

        TreeNode results = LowestCommonAncestorOfABinaryTree.lowestCommonAncestor(firstNode, firstNode, secondNode);
        Assertions.assertEquals(1, results.val);
    }
}
