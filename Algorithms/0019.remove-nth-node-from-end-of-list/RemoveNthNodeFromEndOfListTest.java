import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveNthNodeFromEndOfListTest {
    RemoveNthNodeFromEndOfList RemoveNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

    @Test
    void Example1() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode forthNode = new ListNode(4);
        ListNode fifthNode = new ListNode(5);

        int n = 2;

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = fifthNode;

        ListNode results = RemoveNthNodeFromEndOfList.removeNthFromEnd(firstNode, n);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fifthNode;

        Assertions.assertEquals(firstNode, results);
    }

    @Test
    void Example2() {
        ListNode firstNode = new ListNode(1);

        int n = 1;

        ListNode results = RemoveNthNodeFromEndOfList.removeNthFromEnd(firstNode, n);

        Assertions.assertNull(results);
    }

    @Test
    void Example3() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);

        int n = 1;

        firstNode.next = secondNode;

        ListNode results = RemoveNthNodeFromEndOfList.removeNthFromEnd(firstNode, n);

        firstNode.next = null;

        Assertions.assertEquals(firstNode, results);
    }
}
