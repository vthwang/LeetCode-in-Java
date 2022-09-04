import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VerticalOrderTraversalOfABinaryTreeTest {
    VerticalOrderTraversalOfABinaryTree VerticalOrderTraversalOfABinaryTree = new VerticalOrderTraversalOfABinaryTree();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(3);
        root.left= new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> results = VerticalOrderTraversalOfABinaryTree.verticalTraversal(root);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(List.of(9));
        expectedResults.add(Arrays.asList(3, 15));
        expectedResults.add(List.of(20));
        expectedResults.add(List.of(7));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<List<Integer>> results = VerticalOrderTraversalOfABinaryTree.verticalTraversal(root);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(List.of(4));
        expectedResults.add(List.of(2));
        expectedResults.add(Arrays.asList(1, 5, 6));
        expectedResults.add(List.of(3));
        expectedResults.add(List.of(7));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        List<List<Integer>> results = VerticalOrderTraversalOfABinaryTree.verticalTraversal(root);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(List.of(4));
        expectedResults.add(List.of(2));
        expectedResults.add(Arrays.asList(1, 5, 6));
        expectedResults.add(List.of(3));
        expectedResults.add(List.of(7));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        TreeNode root = new TreeNode(3);
        root.left= new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        List<List<Integer>> results = VerticalOrderTraversalOfABinaryTree.verticalTraversal(root);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(List.of(0));
        expectedResults.add(List.of(1));
        expectedResults.add(Arrays.asList(3, 2, 2));
        expectedResults.add(List.of(4));

        Assertions.assertEquals(expectedResults, results);
    }
}
