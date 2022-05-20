import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversalTest {
    BinaryTreePostorderTraversal BinaryTreePostorderTraversal = new BinaryTreePostorderTraversal();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(3);

        firstNode.right = secondNode;
        secondNode.left = thirdNode;

        List<Integer> results = BinaryTreePostorderTraversal.postorderTraversal(firstNode);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);
        expectedResult.add(2);
        expectedResult.add(1);

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        List<Integer> results = BinaryTreePostorderTraversal.postorderTraversal(null);
        List<Integer> expectedResult = new ArrayList<>();

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example3() {
        TreeNode firstNode = new TreeNode(1);

        List<Integer> results = BinaryTreePostorderTraversal.postorderTraversal(firstNode);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);

        Assertions.assertEquals(expectedResult, results);
    }
}
