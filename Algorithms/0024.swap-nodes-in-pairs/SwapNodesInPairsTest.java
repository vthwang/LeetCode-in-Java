import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwapNodesInPairsTest {
    SwapNodesInPairs SwapNodesInPairs = new SwapNodesInPairs();

    @Test
    void Example1() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode forthNode = new ListNode(4);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        ListNode results = SwapNodesInPairs.swapPairs(firstNode);

        secondNode.next = firstNode;
        firstNode.next = forthNode;
        forthNode.next = thirdNode;
        thirdNode.next = null;

        Assertions.assertEquals(secondNode, results);
    }

    @Test
    void Example2() {
        ListNode firstNode = null;

        ListNode results = SwapNodesInPairs.swapPairs(firstNode);

        Assertions.assertNull(results);
    }

    @Test
    void Example3() {
        ListNode firstNode = new ListNode(1);

        ListNode results = SwapNodesInPairs.swapPairs(firstNode);

        Assertions.assertEquals(firstNode, results);
    }
}
