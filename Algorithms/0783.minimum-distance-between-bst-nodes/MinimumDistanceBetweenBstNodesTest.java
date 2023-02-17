import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumDistanceBetweenBstNodesTest {
    MinimumDistanceBetweenBstNodes minimumDistanceBetweenBstNodes = new MinimumDistanceBetweenBstNodes();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Assertions.assertEquals(1, minimumDistanceBetweenBstNodes.minDiffInBST(root));
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(48);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(49);

        Assertions.assertEquals(1, minimumDistanceBetweenBstNodes.minDiffInBST(root));
    }
}
