import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathSumIiiTest {
    PathSumIii PathSumIii = new PathSumIii();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(10);
        TreeNode secondNode = new TreeNode(5);
        TreeNode thirdNode = new TreeNode(-3);
        TreeNode forthNode = new TreeNode(3);
        TreeNode fifthNode = new TreeNode(2);
        TreeNode sixthNode = new TreeNode(11);
        TreeNode seventhNode = new TreeNode(3);
        TreeNode eighthNode = new TreeNode(-2);
        TreeNode ninthNode = new TreeNode(1);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        thirdNode.right = sixthNode;
        forthNode.left = seventhNode;
        forthNode.right = eighthNode;
        fifthNode.right = ninthNode;

        int targetSum = 8;
        int results = PathSumIii.pathSum(firstNode, targetSum);
        int expectedResult = 3;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(5);
        TreeNode secondNode = new TreeNode(4);
        TreeNode thirdNode = new TreeNode(8);
        TreeNode forthNode = new TreeNode(11);
        TreeNode fifthNode = new TreeNode(13);
        TreeNode sixthNode = new TreeNode(4);
        TreeNode seventhNode = new TreeNode(7);
        TreeNode eighthNode = new TreeNode(2);
        TreeNode ninthNode = new TreeNode(5);
        TreeNode tenthNode = new TreeNode(1);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        thirdNode.left = fifthNode;
        thirdNode.right = sixthNode;
        forthNode.left = seventhNode;
        forthNode.right = eighthNode;
        fifthNode.left = ninthNode;
        fifthNode.right = tenthNode;

        int targetSum = 22;
        int results = PathSumIii.pathSum(firstNode, targetSum);
        int expectedResult = 3;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example3() {
        TreeNode firstNode = new TreeNode(1000000000);
        TreeNode secondNode = new TreeNode(1000000000);
        TreeNode thirdNode = new TreeNode(294967296);
        TreeNode forthNode = new TreeNode(1000000000);
        TreeNode fifthNode = new TreeNode(1000000000);
        TreeNode sixthNode = new TreeNode(1000000000);

        firstNode.left = secondNode;
        secondNode.left = thirdNode;
        thirdNode.left = forthNode;
        forthNode.left = fifthNode;
        fifthNode.left = sixthNode;

        int targetSum = 0;
        int results = PathSumIii.pathSum(firstNode, targetSum);
        int expectedResult = 0;

        Assertions.assertEquals(expectedResult, results);
    }
}
