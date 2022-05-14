import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenLinkedListTest {
    OddEvenLinkedList OddEvenLinkedList = new OddEvenLinkedList();

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

        ListNode results = OddEvenLinkedList.oddEvenList(firstNode);

        firstNode.next = thirdNode;
        thirdNode.next = fifthNode;
        fifthNode.next = secondNode;
        secondNode.next = forthNode;
        forthNode.next = null;

        Assertions.assertEquals(firstNode, results);
    }

    @Test
    void Example2() {
        ListNode firstNode = new ListNode(2);
        ListNode secondNode = new ListNode(1);
        ListNode thirdNode = new ListNode(3);
        ListNode forthNode = new ListNode(5);
        ListNode fifthNode = new ListNode(6);
        ListNode sixthNode = new ListNode(4);
        ListNode seventhNode = new ListNode(7);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = fifthNode;
        fifthNode.next = sixthNode;
        sixthNode.next = seventhNode;

        ListNode results = OddEvenLinkedList.oddEvenList(firstNode);

        firstNode.next = thirdNode;
        thirdNode.next = fifthNode;
        fifthNode.next = seventhNode;
        seventhNode.next = secondNode;
        secondNode.next = forthNode;
        forthNode.next = sixthNode;
        sixthNode.next = null;

        Assertions.assertEquals(firstNode, results);
    }
}
