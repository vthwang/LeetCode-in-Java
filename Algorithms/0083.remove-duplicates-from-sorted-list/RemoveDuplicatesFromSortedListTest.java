import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedListTest {
    RemoveDuplicatesFromSortedList RemoveDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

    @Test
    void Example1() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(1);
        ListNode thirdNode = new ListNode(2);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;

        ListNode results = RemoveDuplicatesFromSortedList.deleteDuplicates(firstNode);

        secondNode.next = thirdNode;

        Assertions.assertEquals(secondNode, results);
    }

    @Test
    void Example2() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(1);
        ListNode thirdNode = new ListNode(2);
        ListNode forthNode = new ListNode(3);
        ListNode fifthNode = new ListNode(3);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = fifthNode;

        ListNode results = RemoveDuplicatesFromSortedList.deleteDuplicates(firstNode);

        secondNode.next = thirdNode;
        thirdNode.next = fifthNode;

        Assertions.assertEquals(secondNode, results);
    }
}
