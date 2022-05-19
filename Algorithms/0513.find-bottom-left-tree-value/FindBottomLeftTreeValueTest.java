import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindBottomLeftTreeValueTest {
    FindBottomLeftTreeValue FindBottomLeftTreeValue = new FindBottomLeftTreeValue();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(2);
        TreeNode secondNode = new TreeNode(1);
        TreeNode thirdNode = new TreeNode(3);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;

        int results = FindBottomLeftTreeValue.findBottomLeftValue(firstNode);
        int expectedResult = 1;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(3);
        TreeNode forthNode = new TreeNode(4);
        TreeNode fifthNode = new TreeNode(5);
        TreeNode sixthNode = new TreeNode(6);
        TreeNode seventhNode = new TreeNode(7);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        thirdNode.left = fifthNode;
        thirdNode.right = sixthNode;
        fifthNode.left = seventhNode;

        int results = FindBottomLeftTreeValue.findBottomLeftValue(firstNode);
        int expectedResult = 7;

        Assertions.assertEquals(expectedResult, results);
    }
}
