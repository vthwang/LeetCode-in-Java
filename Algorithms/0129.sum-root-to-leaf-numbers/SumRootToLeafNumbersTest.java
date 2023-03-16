import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumRootToLeafNumbersTest {
    SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        Assertions.assertEquals(25, sumRootToLeafNumbers.sumNumbers(root));
    }

    @Test
    void Example2() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);

        Assertions.assertEquals(1026, sumRootToLeafNumbers.sumNumbers(root));
    }
}
