import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumIvInputIsABstTest {
    TwoSumIvInputIsABst TwoSumIvInputIsABst = new TwoSumIvInputIsABst();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(5);
        TreeNode secondNode = new TreeNode(3);
        TreeNode thirdNode = new TreeNode(6);
        TreeNode forthNode = new TreeNode(2);
        TreeNode fifthNode = new TreeNode(4);
        TreeNode sixthNode = new TreeNode(7);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        thirdNode.right = sixthNode;

        int k = 9;
        boolean results = TwoSumIvInputIsABst.findTarget(firstNode, k);
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(5);
        TreeNode secondNode = new TreeNode(3);
        TreeNode thirdNode = new TreeNode(6);
        TreeNode forthNode = new TreeNode(2);
        TreeNode fifthNode = new TreeNode(4);
        TreeNode sixthNode = new TreeNode(7);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        thirdNode.right = sixthNode;

        int k = 28;
        boolean results = TwoSumIvInputIsABst.findTarget(firstNode, k);
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult, results);
    }
}
