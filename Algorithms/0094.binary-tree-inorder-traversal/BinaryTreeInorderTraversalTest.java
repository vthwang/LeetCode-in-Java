import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversalTest {
    BinaryTreeInorderTraversal BinaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(3);

        firstNode.right = secondNode;
        secondNode.left = thirdNode;

        List<Integer> results = BinaryTreeInorderTraversal.inorderTraversal(firstNode);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(3);
        expectedResult.add(2);

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        List<Integer> results = BinaryTreeInorderTraversal.inorderTraversal(null);
        List<Integer> expectedResult = new ArrayList<>();

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example3() {
        TreeNode firstNode = new TreeNode(1);

        List<Integer> results = BinaryTreeInorderTraversal.inorderTraversal(firstNode);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);

        Assertions.assertEquals(expectedResult, results);
    }
}
