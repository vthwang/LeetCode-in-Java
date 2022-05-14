import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeLinkedListTest {
    PalindromeLinkedList PalindromeLinkedList = new PalindromeLinkedList();

    @Test
    void Example1() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(2);
        ListNode forthNode = new ListNode(1);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        boolean results = PalindromeLinkedList.isPalindrome(firstNode);

        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        ListNode firstNode = new ListNode(1);
        firstNode.next = new ListNode(2);

        boolean results = PalindromeLinkedList.isPalindrome(firstNode);

        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
