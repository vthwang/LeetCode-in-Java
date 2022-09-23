import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PathSumIiTest {
    PathSumIi PathSumIi = new PathSumIi();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        int targetSum = 22;
        List<List<Integer>> results = PathSumIi.pathSum(root, targetSum);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(5, 4, 11, 2));
        expectedResults.add(Arrays.asList(5, 8, 4, 5));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int targetSum = 5;
        List<List<Integer>> results = PathSumIi.pathSum(root, targetSum);
        List<List<Integer>> expectedResults = new ArrayList<>();

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        int targetSum = 0;
        List<List<Integer>> results = PathSumIi.pathSum(root, targetSum);
        List<List<Integer>> expectedResults = new ArrayList<>();

        Assertions.assertEquals(expectedResults, results);
    }
}
