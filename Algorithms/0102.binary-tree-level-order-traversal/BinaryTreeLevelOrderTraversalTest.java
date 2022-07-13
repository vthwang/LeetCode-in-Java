import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalTest {
    BinaryTreeLevelOrderTraversal BinaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> results = BinaryTreeLevelOrderTraversal.levelOrder(root);
        List<List<Integer>> expectedResult = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        List<Integer> third = new ArrayList<>();
        first.add(3);
        second.add(9);
        second.add(20);
        third.add(15);
        third.add(7);
        expectedResult.add(first);
        expectedResult.add(second);
        expectedResult.add(third);
        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(1);

        List<List<Integer>> results = BinaryTreeLevelOrderTraversal.levelOrder(root);
        List<List<Integer>> expectedResult = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        expectedResult.add(first);
        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example3() {
        TreeNode root = null;

        List<List<Integer>> results = BinaryTreeLevelOrderTraversal.levelOrder(root);
        List<List<Integer>> expectedResult = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        expectedResult.add(first);
        Assertions.assertEquals(expectedResult, results);
    }
}
