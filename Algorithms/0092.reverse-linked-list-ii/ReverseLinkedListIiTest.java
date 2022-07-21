import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListIiTest {
    ReverseLinkedListIi ReverseLinkedListIi = new ReverseLinkedListIi();

    @Test
    void Example1() {
        int left = 2, right = 4;
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = ReverseLinkedListIi.reverseBetween(head, left, right);

        Assertions.assertEquals(1, result.val);
        Assertions.assertEquals(4, result.next.val);
        Assertions.assertEquals(3, result.next.next.val);
        Assertions.assertEquals(2, result.next.next.next.val);
        Assertions.assertEquals(5, result.next.next.next.next.val);
    }

    @Test
    void Example2() {
        int left = 1, right = 1;
        ListNode head = new ListNode(5);
        ListNode result = ReverseLinkedListIi.reverseBetween(head, left, right);

        Assertions.assertEquals(5, result.val);
    }
}
