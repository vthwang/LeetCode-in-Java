import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {
    AddTwoNumbers AddTwoNumbers = new AddTwoNumbers();

    @Test
    void Example1() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode results = AddTwoNumbers.addTwoNumbers(l1, l2);
        Assertions.assertEquals(7, results.val);
        Assertions.assertEquals(0, results.next.val);
        Assertions.assertEquals(8, results.next.next.val);
    }

    @Test
    void Example2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode results = AddTwoNumbers.addTwoNumbers(l1, l2);
        Assertions.assertEquals(0, results.val);
    }

    @Test
    void Example3() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode results = AddTwoNumbers.addTwoNumbers(l1, l2);
        Assertions.assertEquals(8, results.val);
        Assertions.assertEquals(9, results.next.val);
        Assertions.assertEquals(9, results.next.next.val);
        Assertions.assertEquals(9, results.next.next.next.val);
        Assertions.assertEquals(0, results.next.next.next.next.val);
        Assertions.assertEquals(0, results.next.next.next.next.next.val);
        Assertions.assertEquals(0, results.next.next.next.next.next.next.val);
        Assertions.assertEquals(1, results.next.next.next.next.next.next.next.val);
    }
}
