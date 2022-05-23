import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumAbsoluteDifferenceInBstTest {
    MinimumAbsoluteDifferenceInBst MinimumAbsoluteDifferenceInBst = new MinimumAbsoluteDifferenceInBst();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(4);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(6);
        TreeNode forthNode = new TreeNode(1);
        TreeNode fifthNode = new TreeNode(3);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;

        int results = MinimumAbsoluteDifferenceInBst.getMinimumDifference(firstNode);
        int expectedResult = 1;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(0);
        TreeNode thirdNode = new TreeNode(48);
        TreeNode forthNode = new TreeNode(12);
        TreeNode fifthNode = new TreeNode(49);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        thirdNode.left = forthNode;
        thirdNode.right = fifthNode;

        int results = MinimumAbsoluteDifferenceInBst.getMinimumDifference(firstNode);
        int expectedResult = 1;

        Assertions.assertEquals(expectedResult, results);
    }
}
