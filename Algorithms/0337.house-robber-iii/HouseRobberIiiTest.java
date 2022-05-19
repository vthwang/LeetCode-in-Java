import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberIiiTest {
    HouseRobberIii HouseRobberIii = new HouseRobberIii();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(3);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(3);
        TreeNode forthNode = new TreeNode(3);
        TreeNode fifthNode = new TreeNode(1);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.right = forthNode;
        thirdNode.right = fifthNode;

        int results = HouseRobberIii.rob(firstNode);
        int expectedResult = 7;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(3);
        TreeNode secondNode = new TreeNode(4);
        TreeNode thirdNode = new TreeNode(5);
        TreeNode forthNode = new TreeNode(1);
        TreeNode fifthNode = new TreeNode(3);
        TreeNode sixthNode = new TreeNode(1);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        thirdNode.right = sixthNode;

        int results = HouseRobberIii.rob(firstNode);
        int expectedResult = 9;

        Assertions.assertEquals(expectedResult, results);
    }
}
