import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortListTest {
    SortList SortList = new SortList();

    @Test
    void Example1() {
        ListNode firstNode = new ListNode(4);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(1);
        ListNode forthNode = new ListNode(3);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        ListNode results = SortList.sortList(firstNode);

        Assertions.assertEquals(1, results.val);
        Assertions.assertEquals(2, results.next.val);
        Assertions.assertEquals(3, results.next.next.val);
        Assertions.assertEquals(4, results.next.next.next.val);
    }

    @Test
    void Example2() {
        ListNode firstNode = new ListNode(-1);
        ListNode secondNode = new ListNode(5);
        ListNode thirdNode = new ListNode(3);
        ListNode forthNode = new ListNode(4);
        ListNode fifthNode = new ListNode(0);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = fifthNode;

        ListNode results = SortList.sortList(firstNode);

        firstNode.next = fifthNode;
        fifthNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = secondNode;
        secondNode.next = null;

        Assertions.assertEquals(-1, results.val);
        Assertions.assertEquals(0, results.next.val);
        Assertions.assertEquals(3, results.next.next.val);
        Assertions.assertEquals(4, results.next.next.next.val);
        Assertions.assertEquals(5, results.next.next.next.next.val);
    }

    @Test
    void Example3() {
        ListNode results = SortList.sortList(null);

        Assertions.assertNull(results);
    }
}
