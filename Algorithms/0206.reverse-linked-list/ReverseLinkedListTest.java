import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {
    ReverseLinkedList ReverseLinkedList = new ReverseLinkedList();

    @Test
    void Example1() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode forthNode = new ListNode(4);
        ListNode fifthNode = new ListNode(5);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = fifthNode;

        ListNode results = ReverseLinkedList.reverseList(firstNode);

        fifthNode.next = forthNode;
        forthNode.next = thirdNode;
        thirdNode.next = secondNode;
        secondNode.next = firstNode;
        firstNode.next = null;

        Assertions.assertEquals(fifthNode, results);
    }

    @Test
    void Example2() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);

        firstNode.next = secondNode;

        ListNode results = ReverseLinkedList.reverseList(firstNode);

        secondNode.next = firstNode;
        firstNode.next = null;

        Assertions.assertEquals(secondNode, results);
    }

    @Test
    void Example3() {
        ListNode firstNode = null;

        ListNode results = ReverseLinkedList.reverseList(firstNode);
        Assertions.assertNull(results);
    }
}
