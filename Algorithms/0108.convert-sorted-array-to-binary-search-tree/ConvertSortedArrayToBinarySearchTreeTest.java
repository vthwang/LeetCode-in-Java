import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertSortedArrayToBinarySearchTreeTest {
    ConvertSortedArrayToBinarySearchTree ConvertSortedArrayToBinarySearchTree = new ConvertSortedArrayToBinarySearchTree();
    ConvertSortedArrayToBinarySearchTree2 ConvertSortedArrayToBinarySearchTree2 = new ConvertSortedArrayToBinarySearchTree2();

    @Test
    void Example1() {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode results = ConvertSortedArrayToBinarySearchTree.sortedArrayToBST(nums);

        Assertions.assertEquals(0, results.val);
        Assertions.assertEquals(-10, results.left.val);
        Assertions.assertEquals(5, results.right.val);
        Assertions.assertEquals(-3, results.left.right.val);
        Assertions.assertEquals(9, results.right.right.val);
    }

    @Test
    void Example2() {
        int[] nums = {1, 3};
        TreeNode results = ConvertSortedArrayToBinarySearchTree.sortedArrayToBST(nums);

        Assertions.assertEquals(1, results.val);
        Assertions.assertEquals(3, results.right.val);
    }

    @Test
    void Example3() {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode results = ConvertSortedArrayToBinarySearchTree2.sortedArrayToBST(nums);

        Assertions.assertEquals(0, results.val);
        Assertions.assertEquals(-3, results.left.val);
        Assertions.assertEquals(9, results.right.val);
        Assertions.assertEquals(-10, results.left.left.val);
        Assertions.assertEquals(5, results.right.left.val);
    }

    @Test
    void Example4() {
        int[] nums = {1, 3};
        TreeNode results = ConvertSortedArrayToBinarySearchTree2.sortedArrayToBST(nums);

        Assertions.assertEquals(3, results.val);
        Assertions.assertEquals(1, results.left.val);
    }
}
