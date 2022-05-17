import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathSumTest {
    PathSum PathSum = new PathSum();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(5);
        TreeNode secondNode = new TreeNode(4);
        TreeNode thirdNode = new TreeNode(8);
        TreeNode forthNode = new TreeNode(11);
        TreeNode fifthNode = new TreeNode(13);
        TreeNode sixthNode = new TreeNode(4);
        TreeNode seventhNode = new TreeNode(7);
        TreeNode eighthNode = new TreeNode(2);
        TreeNode ninthNode = new TreeNode(1);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        thirdNode.left = fifthNode;
        thirdNode.right = sixthNode;
        forthNode.left = seventhNode;
        forthNode.right = eighthNode;
        sixthNode.right = ninthNode;

        int targetSum = 22;
        boolean results = PathSum.hasPathSum(firstNode, targetSum);
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(3);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;

        int targetSum = 5;
        boolean results = PathSum.hasPathSum(firstNode, targetSum);
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example3() {
        int targetSum = 0;
        boolean results = PathSum.hasPathSum(null, targetSum);
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult, results);
    }
}
