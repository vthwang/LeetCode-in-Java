import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {
    ConstructBinaryTreeFromInorderAndPostorderTraversal constructBinaryTreeFromInorderAndPostorderTraversal = new ConstructBinaryTreeFromInorderAndPostorderTraversal();

    @Test
    void Example1() {
        int[] inorder = {9, 3, 15, 20, 7},  postorder = {9, 15, 7, 20, 3};
        TreeNode root = constructBinaryTreeFromInorderAndPostorderTraversal.buildTree(inorder, postorder);

        Assertions.assertEquals(3, root.val);
        Assertions.assertEquals(9, root.left.val);
        Assertions.assertEquals(20, root.right.val);
        Assertions.assertEquals(15, root.right.left.val);
        Assertions.assertEquals(7, root.right.right.val);
    }

    @Test
    void Example2() {
        int[] inorder = {-1}, postorder = {-1};
        TreeNode root = constructBinaryTreeFromInorderAndPostorderTraversal.buildTree(inorder, postorder);

        Assertions.assertEquals(-1, root.val);
    }
}
