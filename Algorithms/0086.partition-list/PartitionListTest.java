import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionListTest {
    PartitionList PartitionList = new PartitionList();

    @Test
    void Example1() {
        int x = 3;
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        ListNode result = PartitionList.partition(head, x);

        Assertions.assertEquals(1, result.val);
        Assertions.assertEquals(2, result.next.val);
        Assertions.assertEquals(2, result.next.next.val);
        Assertions.assertEquals(4, result.next.next.next.val);
        Assertions.assertEquals(3, result.next.next.next.next.val);
        Assertions.assertEquals(5, result.next.next.next.next.next.val);
    }

    @Test
    void Example2() {
        int x = 2;
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        ListNode result = PartitionList.partition(head, x);

        Assertions.assertEquals(1, result.val);
        Assertions.assertEquals(2, result.next.val);
    }
}
