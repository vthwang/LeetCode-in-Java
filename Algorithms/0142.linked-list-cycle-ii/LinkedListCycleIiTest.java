import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycleIiTest {
    LinkedListCycleIi LinkedListCycleIi = new LinkedListCycleIi();

    @Test
    void Example1() {
        ListNode head = new ListNode(3);
        ListNode secondNode = new ListNode(2);
        head.next = secondNode;
        secondNode.next = new ListNode(0);
        secondNode.next.next = new ListNode(-4);
        secondNode.next.next.next = secondNode;

        ListNode result = LinkedListCycleIi.detectCycle(head);

        Assertions.assertEquals(2, result.val);
    }

    @Test
    void Example2() {
        ListNode head = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        head.next = secondNode;
        secondNode.next = head;

        ListNode result = LinkedListCycleIi.detectCycle(head);

        Assertions.assertEquals(1, result.val);
    }

    @Test
    void Example3() {
        ListNode head = new ListNode(1);
        ListNode result = LinkedListCycleIi.detectCycle(head);

        Assertions.assertNull(result);
    }
}
