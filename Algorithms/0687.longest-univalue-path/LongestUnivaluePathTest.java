import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestUnivaluePathTest {
    LongestUnivaluePath LongestUnivaluePath = new LongestUnivaluePath();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(5);
        TreeNode secondNode = new TreeNode(4);
        TreeNode thirdNode = new TreeNode(5);
        TreeNode forthNode = new TreeNode(1);
        TreeNode fifthNode = new TreeNode(1);
        TreeNode sixthNode = new TreeNode(5);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        thirdNode.right = sixthNode;

        int results = LongestUnivaluePath.longestUnivaluePath(firstNode);
        int expectedResult = 2;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(4);
        TreeNode thirdNode = new TreeNode(5);
        TreeNode forthNode = new TreeNode(4);
        TreeNode fifthNode = new TreeNode(4);
        TreeNode sixthNode = new TreeNode(5);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        thirdNode.right = sixthNode;

        int results = LongestUnivaluePath.longestUnivaluePath(firstNode);
        int expectedResult = 2;

        Assertions.assertEquals(expectedResult, results);
    }
}
