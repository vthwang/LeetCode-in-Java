import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RangeSumOfBstTest {
    RangeSumOfBst rangeSumOfBst = new RangeSumOfBst();
    RangeSumOfBst2 rangeSumOfBst2 = new RangeSumOfBst2();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right = new TreeNode(15);
        root.right.right = new TreeNode(18);

        int results = rangeSumOfBst.rangeSumBST(root, 7, 15);
        int expectedResults = 32;

        Assertions.assertEquals(expectedResults, results);

        results = rangeSumOfBst2.rangeSumBST(root, 7, 15);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(1);
        root.left.right = new TreeNode(7);
        root.left.right.left = new TreeNode(6);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);

        int results = rangeSumOfBst.rangeSumBST(root, 6, 10);
        int expectedResults = 23;

        Assertions.assertEquals(expectedResults, results);

        results = rangeSumOfBst2.rangeSumBST(root, 6, 10);
        Assertions.assertEquals(expectedResults, results);
    }
}
