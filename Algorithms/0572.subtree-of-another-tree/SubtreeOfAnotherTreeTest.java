import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtreeOfAnotherTreeTest {
    SubtreeOfAnotherTree SubtreeOfAnotherTree = new SubtreeOfAnotherTree();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(3);
        TreeNode secondNode = new TreeNode(4);
        TreeNode thirdNode = new TreeNode(5);
        TreeNode forthNode = new TreeNode(1);
        TreeNode fifthNode = new TreeNode(2);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;

        TreeNode subRootFirstNode = new TreeNode(4);
        TreeNode subRootSecondNode = new TreeNode(1);
        TreeNode subRootThirdNode = new TreeNode(2);

        subRootFirstNode.left = subRootSecondNode;
        subRootFirstNode.right = subRootThirdNode;

        boolean results = SubtreeOfAnotherTree.isSubtree(firstNode, subRootFirstNode);
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(3);
        TreeNode secondNode = new TreeNode(4);
        TreeNode thirdNode = new TreeNode(5);
        TreeNode forthNode = new TreeNode(1);
        TreeNode fifthNode = new TreeNode(2);
        TreeNode sixthNode = new TreeNode(0);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        fifthNode.left = sixthNode;

        TreeNode subRootFirstNode = new TreeNode(4);
        TreeNode subRootSecondNode = new TreeNode(1);
        TreeNode subRootThirdNode = new TreeNode(2);

        subRootFirstNode.left = subRootSecondNode;
        subRootFirstNode.right = subRootThirdNode;

        boolean results = SubtreeOfAnotherTree.isSubtree(firstNode, subRootFirstNode);
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult, results);
    }
}
