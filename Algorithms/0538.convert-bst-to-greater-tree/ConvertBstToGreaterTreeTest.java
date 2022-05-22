import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertBstToGreaterTreeTest {
    ConvertBstToGreaterTree ConvertBstToGreaterTree = new ConvertBstToGreaterTree();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(4);
        TreeNode secondNode = new TreeNode(1);
        TreeNode thirdNode = new TreeNode(6);
        TreeNode forthNode = new TreeNode(0);
        TreeNode fifthNode = new TreeNode(2);
        TreeNode sixthNode = new TreeNode(5);
        TreeNode seventhNode = new TreeNode(7);
        TreeNode eighthNode = new TreeNode(3);
        TreeNode ninthNode = new TreeNode(8);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        thirdNode.left = sixthNode;
        thirdNode.right = seventhNode;
        fifthNode.right =eighthNode;
        seventhNode.right = ninthNode;

        TreeNode results = ConvertBstToGreaterTree.convertBST(firstNode);
        Assertions.assertEquals(30, results.val);
        Assertions.assertEquals(36, results.left.val);
        Assertions.assertEquals(21, results.right.val);
        Assertions.assertEquals(36, results.left.left.val);
        Assertions.assertEquals(35, results.left.right.val);
        Assertions.assertEquals(26, results.right.left.val);
        Assertions.assertEquals(15, results.right.right.val);
        Assertions.assertEquals(33, results.left.right.right.val);
        Assertions.assertEquals(8, results.right.right.right.val);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(0);
        firstNode.right = new TreeNode(1);

        TreeNode results = ConvertBstToGreaterTree.convertBST(firstNode);

        Assertions.assertEquals(1, results.val);
        Assertions.assertEquals(1, results.right.val);
    }
}
