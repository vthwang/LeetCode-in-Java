import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SplitLinkedListInPartsTest {
    SplitLinkedListInParts SplitLinkedListInParts = new SplitLinkedListInParts();

    @Test
    void Example1() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;

        int k = 5;

        ListNode[] results = SplitLinkedListInParts.splitListToParts(firstNode, k);

        ListNode[] expectedResult = new ListNode[k];
        firstNode.next = null;
        secondNode.next = null;
        thirdNode.next = null;
        expectedResult[0] = firstNode;
        expectedResult[1] = secondNode;
        expectedResult[2] = thirdNode;

        for (int i = 0; i < k; i++) {
            Assertions.assertEquals(expectedResult[i], results[i]);
        }
    }

    @Test
    void Example2() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode forthNode = new ListNode(4);
        ListNode fifthNode = new ListNode(5);
        ListNode sixthNode = new ListNode(6);
        ListNode seventhNode = new ListNode(7);
        ListNode eighthNode = new ListNode(8);
        ListNode ninthNode = new ListNode(9);
        ListNode tenthNode = new ListNode(10);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = fifthNode;
        fifthNode.next = sixthNode;
        sixthNode.next = seventhNode;
        seventhNode.next = eighthNode;
        eighthNode.next = ninthNode;
        ninthNode.next = tenthNode;

        int k = 3;

        ListNode[] results = SplitLinkedListInParts.splitListToParts(firstNode, k);

        forthNode.next = null;
        seventhNode.next = null;

        ListNode[] expectedResult = new ListNode[k];
        expectedResult[0] = firstNode;
        expectedResult[1] = fifthNode;
        expectedResult[2] = eighthNode;

        for (int i = 0; i < k; i++) {
            Assertions.assertEquals(expectedResult[i], results[i]);
        }
    }
}
