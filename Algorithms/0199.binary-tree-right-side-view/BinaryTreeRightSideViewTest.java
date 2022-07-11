import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideViewTest {
    BinaryTreeRightSideView BinaryTreeRightSideView = new BinaryTreeRightSideView();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        List<Integer> results = BinaryTreeRightSideView.rightSideView(root);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(3);
        expectedResult.add(4);
        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);

        List<Integer> results = BinaryTreeRightSideView.rightSideView(root);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(3);
        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example3() {
        TreeNode root = null;

        List<Integer> results = BinaryTreeRightSideView.rightSideView(root);
        List<Integer> expectedResult = new ArrayList<>();
        Assertions.assertEquals(expectedResult, results);
    }
}
