import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedListIiTest {
    RemoveDuplicatesFromSortedListIi RemoveDuplicatesFromSortedListIi = new RemoveDuplicatesFromSortedListIi();

    @Test
    void Example1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        ListNode results = RemoveDuplicatesFromSortedListIi.deleteDuplicates(head);

        Assertions.assertEquals(1, results.val);
        Assertions.assertEquals(2, results.next.val);
        Assertions.assertEquals(5, results.next.next.val);
    }

    @Test
    void Example2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);

        ListNode results = RemoveDuplicatesFromSortedListIi.deleteDuplicates(head);

        Assertions.assertEquals(2, results.val);
        Assertions.assertEquals(3, results.next.val);
    }
}
