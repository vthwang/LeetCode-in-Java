import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeleteTheMiddleNodeOfALinkedListTest {
    DeleteTheMiddleNodeOfALinkedList DeleteTheMiddleNodeOfALinkedList = new DeleteTheMiddleNodeOfALinkedList();

    @Test
    void Example1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(6);
        ListNode results = DeleteTheMiddleNodeOfALinkedList.deleteMiddle(head);

        Assertions.assertEquals(1, results.next.next.next.val);
    }

    @Test
    void Example2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode results = DeleteTheMiddleNodeOfALinkedList.deleteMiddle(head);

        Assertions.assertEquals(4, results.next.next.val);
    }

    @Test
    void Example3() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        ListNode results = DeleteTheMiddleNodeOfALinkedList.deleteMiddle(head);

        Assertions.assertEquals(2, results.val);
    }

    @Test
    void Example4() {
        ListNode head = new ListNode(1);
        ListNode results = DeleteTheMiddleNodeOfALinkedList.deleteMiddle(head);

        Assertions.assertNull(results);
    }
}
