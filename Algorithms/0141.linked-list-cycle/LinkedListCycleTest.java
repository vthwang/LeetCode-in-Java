import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycleTest {
    LinkedListCycle LinkedListCycle = new LinkedListCycle();

    @Test
    void Example1() {
        ListNode zeroNode = new ListNode(3);
        ListNode firstNode = new ListNode(2);
        ListNode secondNode = new ListNode(0);
        ListNode thirdNode = new ListNode(-4);
        zeroNode.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = firstNode;

        boolean expectedResults = true;

        boolean results;

        results = LinkedListCycle.hasCycle(zeroNode);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        ListNode zeroNode = new ListNode(1);
        ListNode firstNode = new ListNode(2);
        zeroNode.next = firstNode;
        firstNode.next = zeroNode;

        boolean expectedResults = true;

        boolean results;

        results = LinkedListCycle.hasCycle(zeroNode);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        ListNode zeroNode = new ListNode(1);

        boolean expectedResults = false;

        boolean results;

        results = LinkedListCycle.hasCycle(zeroNode);
        Assertions.assertEquals(expectedResults, results);
    }

}
