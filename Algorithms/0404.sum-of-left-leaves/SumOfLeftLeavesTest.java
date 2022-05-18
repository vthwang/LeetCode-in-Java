import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfLeftLeavesTest {
    SumOfLeftLeaves SumOfLeftLeaves = new SumOfLeftLeaves();

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

        int results = SumOfLeftLeaves.sumOfLeftLeaves(firstNode);
        int expectedResult = 24;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(1);

        int results = SumOfLeftLeaves.sumOfLeftLeaves(firstNode);
        int expectedResult = 0;

        Assertions.assertEquals(expectedResult, results);
    }
}
