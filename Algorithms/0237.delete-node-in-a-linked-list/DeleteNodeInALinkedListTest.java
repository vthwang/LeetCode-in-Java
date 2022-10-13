import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeleteNodeInALinkedListTest {
    DeleteNodeInALinkedList DeleteNodeInALinkedList = new DeleteNodeInALinkedList();

    @Test
    void Example1() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        DeleteNodeInALinkedList.deleteNode(head.next);

        Assertions.assertEquals(4, head.val);
        Assertions.assertEquals(1, head.next.val);
        Assertions.assertEquals(9, head.next.next.val);
    }

    @Test
    void Example2() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        DeleteNodeInALinkedList.deleteNode(head.next.next);

        Assertions.assertEquals(4, head.val);
        Assertions.assertEquals(5, head.next.val);
        Assertions.assertEquals(9, head.next.next.val);
    }
}
