import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindModeInBinarySearchTreeTest {
    FindModeInBinarySearchTree FindModeInBinarySearchTree = new FindModeInBinarySearchTree();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(2);

        firstNode.right = secondNode;
        secondNode.left = thirdNode;

        int[] results = FindModeInBinarySearchTree.findMode(firstNode);
        int[] expectedResult = {2};

        Assertions.assertArrayEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(0);

        int[] results = FindModeInBinarySearchTree.findMode(firstNode);
        int[] expectedResult = {0};

        Assertions.assertArrayEquals(expectedResult, results);
    }
}
