import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    ConstructBinaryTreeFromPreorderAndInorderTraversal ConstructBinaryTreeFromPreorderAndInorderTraversal = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    @Test
    void Example1() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode results = ConstructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);
        Assertions.assertEquals(3, results.val);
        Assertions.assertEquals(9, results.left.val);
        Assertions.assertEquals(20, results.right.val);
        Assertions.assertEquals(15, results.right.left.val);
        Assertions.assertEquals(7, results.right.right.val);
    }

    @Test
    void Example2() {
        int[] preorder = {-1};
        int[] inorder = {-1};

        TreeNode results = ConstructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);
        Assertions.assertEquals(-1, results.val);
    }
}
