import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwappingNodesInALinkedListTest {
    SwappingNodesInALinkedList swappingNodesInALinkedList = new SwappingNodesInALinkedList();

    @Test
    void Example1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode results = swappingNodesInALinkedList.swapNodes(head, 2);
        Assertions.assertEquals(1, results.val);
        Assertions.assertEquals(4, results.next.val);
        Assertions.assertEquals(3, results.next.next.val);
        Assertions.assertEquals(2, results.next.next.next.val);
        Assertions.assertEquals(5, results.next.next.next.next.val);
    }

    @Test
    void Example2() {
        ListNode head = new ListNode(7);
        head.next = new ListNode(9);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(5);

        ListNode results = swappingNodesInALinkedList.swapNodes(head, 5);
        Assertions.assertEquals(7, results.val);
        Assertions.assertEquals(9, results.next.val);
        Assertions.assertEquals(6, results.next.next.val);
        Assertions.assertEquals(6, results.next.next.next.val);
        Assertions.assertEquals(8, results.next.next.next.next.val);
        Assertions.assertEquals(7, results.next.next.next.next.next.val);
        Assertions.assertEquals(3, results.next.next.next.next.next.next.val);
        Assertions.assertEquals(0, results.next.next.next.next.next.next.next.val);
        Assertions.assertEquals(9, results.next.next.next.next.next.next.next.next.val);
        Assertions.assertEquals(5, results.next.next.next.next.next.next.next.next.next.val);
    }
}
