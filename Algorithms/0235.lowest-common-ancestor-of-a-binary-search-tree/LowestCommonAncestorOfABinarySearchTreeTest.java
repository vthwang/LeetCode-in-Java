import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LowestCommonAncestorOfABinarySearchTreeTest {
    LowestCommonAncestorOfABinarySearchTree LowestCommonAncestorOfABinarySearchTree = new LowestCommonAncestorOfABinarySearchTree();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(6);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(8);
        TreeNode forthNode = new TreeNode(0);
        TreeNode fifthNode = new TreeNode(4);
        TreeNode sixthNode = new TreeNode(7);
        TreeNode seventhNode = new TreeNode(9);
        TreeNode eighthNode = new TreeNode(3);
        TreeNode ninthNode = new TreeNode(5);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        thirdNode.left = sixthNode;
        thirdNode.right = seventhNode;
        fifthNode.left =eighthNode;
        fifthNode.right = ninthNode;

        TreeNode results = LowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(firstNode, secondNode, thirdNode);
        Assertions.assertEquals(6, results.val);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(6);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(8);
        TreeNode forthNode = new TreeNode(0);
        TreeNode fifthNode = new TreeNode(4);
        TreeNode sixthNode = new TreeNode(7);
        TreeNode seventhNode = new TreeNode(9);
        TreeNode eighthNode = new TreeNode(3);
        TreeNode ninthNode = new TreeNode(5);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        thirdNode.left = sixthNode;
        thirdNode.right = seventhNode;
        fifthNode.left =eighthNode;
        fifthNode.right = ninthNode;

        TreeNode results = LowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(firstNode, secondNode, fifthNode);
        Assertions.assertEquals(2, results.val);
    }

    @Test
    void Example3() {
        TreeNode firstNode = new TreeNode(2);
        TreeNode secondNode = new TreeNode(1);

        firstNode.left = secondNode;

        TreeNode results = LowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(firstNode, firstNode, secondNode);
        Assertions.assertEquals(2, results.val);
    }
}
