import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeIteratorTest {
    @Test
    void Example1() {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);

        BSTIterator bSTIterator = new BSTIterator(root);
        Assertions.assertEquals(3, bSTIterator.next());
        Assertions.assertEquals(7, bSTIterator.next());
        Assertions.assertTrue(bSTIterator.hasNext());
        Assertions.assertEquals(9, bSTIterator.next());
        Assertions.assertTrue(bSTIterator.hasNext());
        Assertions.assertEquals(15, bSTIterator.next());
        Assertions.assertTrue(bSTIterator.hasNext());
        Assertions.assertEquals(20, bSTIterator.next());
        Assertions.assertFalse(bSTIterator.hasNext());
    }
}
