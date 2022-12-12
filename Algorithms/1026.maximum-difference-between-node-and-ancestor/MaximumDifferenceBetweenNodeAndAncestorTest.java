import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDifferenceBetweenNodeAndAncestorTest {
    MaximumDifferenceBetweenNodeAndAncestor maximumDifferenceBetweenNodeAndAncestor = new MaximumDifferenceBetweenNodeAndAncestor();
    MaximumDifferenceBetweenNodeAndAncestor2 maximumDifferenceBetweenNodeAndAncestor2 = new MaximumDifferenceBetweenNodeAndAncestor2();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right = new TreeNode(10);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);

        Assertions.assertEquals(7, maximumDifferenceBetweenNodeAndAncestor.maxAncestorDiff(root));
        Assertions.assertEquals(7, maximumDifferenceBetweenNodeAndAncestor2.maxAncestorDiff(root));
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(0);
        root.right.right.left = new TreeNode(3);

        Assertions.assertEquals(3, maximumDifferenceBetweenNodeAndAncestor.maxAncestorDiff(root));
        Assertions.assertEquals(3, maximumDifferenceBetweenNodeAndAncestor2.maxAncestorDiff(root));
    }
}
