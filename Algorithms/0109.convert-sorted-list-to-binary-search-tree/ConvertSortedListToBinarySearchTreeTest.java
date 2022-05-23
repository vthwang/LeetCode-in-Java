import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertSortedListToBinarySearchTreeTest {
    ConvertSortedListToBinarySearchTree ConvertSortedListToBinarySearchTree = new ConvertSortedListToBinarySearchTree();

    @Test
    void Example1() {
        ListNode firstNode = new ListNode(-10);
        ListNode secondNode = new ListNode(-3);
        ListNode thirdNode = new ListNode(0);
        ListNode forthNode = new ListNode(5);
        ListNode fifthNode = new ListNode(9);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = fifthNode;

        TreeNode results = ConvertSortedListToBinarySearchTree.sortedListToBST(firstNode);

        Assertions.assertEquals(0, results.val);
        Assertions.assertEquals(-3, results.left.val);
        Assertions.assertEquals(9, results.right.val);
        Assertions.assertEquals(-10, results.left.left.val);
        Assertions.assertEquals(5, results.right.left.val);
    }

    @Test
    void Example2() {
        TreeNode results = ConvertSortedListToBinarySearchTree.sortedListToBST(null);

        Assertions.assertNull(results);
    }
}
