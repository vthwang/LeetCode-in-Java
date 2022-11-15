import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountCompleteTreeNodesTest {
    CountCompleteTreeNodes CountCompleteTreeNodes = new CountCompleteTreeNodes();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);

        int results = CountCompleteTreeNodes.countNodes(root);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int results = CountCompleteTreeNodes.countNodes(null);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        TreeNode root = new TreeNode(1);
        int results = CountCompleteTreeNodes.countNodes(root);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
