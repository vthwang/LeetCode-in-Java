import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversalTest {
    BinaryTreeZigzagLevelOrderTraversal binaryTreeZigzagLevelOrderTraversal = new BinaryTreeZigzagLevelOrderTraversal();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(List.of(3));
        expectedResults.add(Arrays.asList(20, 9));
        expectedResults.add(Arrays.asList(15, 7));

        Assertions.assertEquals(expectedResults, binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root));
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(1);

        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(List.of(1));

        Assertions.assertEquals(expectedResults, binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root));
    }

    @Test
    void Example3() {
        List<List<Integer>> expectedResults = new ArrayList<>();

        Assertions.assertEquals(expectedResults, binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(null));
    }
}
