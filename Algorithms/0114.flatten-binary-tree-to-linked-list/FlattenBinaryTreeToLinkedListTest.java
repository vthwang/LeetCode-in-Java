import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlattenBinaryTreeToLinkedListTest {
    FlattenBinaryTreeToLinkedList FlattenBinaryTreeToLinkedList = new FlattenBinaryTreeToLinkedList();

    @Test
    void Example1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        FlattenBinaryTreeToLinkedList.flatten(root);

        Assertions.assertEquals(1, root.val);
        Assertions.assertEquals(2, root.right.val);
        Assertions.assertEquals(3, root.right.right.val);
        Assertions.assertEquals(4, root.right.right.right.val);
        Assertions.assertEquals(5, root.right.right.right.right.val);
        Assertions.assertEquals(6, root.right.right.right.right.right.val);
    }

    @Test
    void Example2() {
        TreeNode root = null;
        FlattenBinaryTreeToLinkedList.flatten(root);
        Assertions.assertNull(root);
    }

    @Test
    void Example3() {
        TreeNode root = new TreeNode(0);
        FlattenBinaryTreeToLinkedList.flatten(root);
        Assertions.assertEquals(0, root.val);
    }
}
