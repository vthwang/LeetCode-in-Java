import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MiddleOfTheLinkedListTest {
    MiddleOfTheLinkedList MiddleOfTheLinkedList = new MiddleOfTheLinkedList();

    @Test
    void Example1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = MiddleOfTheLinkedList.middleNode(head);

        Assertions.assertEquals(3, result.val);
        Assertions.assertEquals(4, result.next.val);
        Assertions.assertEquals(5, result.next.next.val);
    }

    @Test
    void Example2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode result = MiddleOfTheLinkedList.middleNode(head);

        Assertions.assertEquals(4, result.val);
        Assertions.assertEquals(5, result.next.val);
        Assertions.assertEquals(6, result.next.next.val);
    }
}
