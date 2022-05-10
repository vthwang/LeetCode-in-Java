import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionOfTwoLinkedListsTest {
    IntersectionOfTwoLinkedLists IntersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();

    @Test
    void Example1() {
        ListNode headAFirstNode = new ListNode(4);
        ListNode headASecondNode = new ListNode(1);

        ListNode headBFirstNode = new ListNode(5);
        ListNode headBSecondNode = new ListNode(6);
        ListNode headBThirdNode = new ListNode(1);

        ListNode intersectionNode = new ListNode(8);
        ListNode intersectionFirstNode = new ListNode(4);
        ListNode intersectionSecondNode = new ListNode(5);

        // Link List
        headAFirstNode.next = headASecondNode;
        headASecondNode.next = intersectionNode;

        headBFirstNode.next = headBSecondNode;
        headBSecondNode.next = headBThirdNode;
        headBThirdNode.next = intersectionNode;

        intersectionNode.next = intersectionFirstNode;
        intersectionFirstNode.next = intersectionSecondNode;

        ListNode results;
        results = IntersectionOfTwoLinkedLists.getIntersectionNode(headAFirstNode, headBFirstNode);
        Assertions.assertEquals(intersectionNode, results);
    }

    @Test
    void Example2() {
        ListNode headAFirstNode = new ListNode(1);
        ListNode headASecondNode = new ListNode(9);
        ListNode headAThirdNode = new ListNode(1);

        ListNode headBFirstNode = new ListNode(3);

        ListNode intersectionNode = new ListNode(2);
        ListNode intersectionFirstNode = new ListNode(4);

        // Link List
        headAFirstNode.next = headASecondNode;
        headASecondNode.next = headAThirdNode;
        headAThirdNode.next = intersectionNode;

        headBFirstNode.next = intersectionNode;

        intersectionNode.next = intersectionFirstNode;

        ListNode results;
        results = IntersectionOfTwoLinkedLists.getIntersectionNode(headAFirstNode, headBFirstNode);
        Assertions.assertEquals(intersectionNode, results);
    }

    @Test
    void Example3() {
        ListNode headAFirstNode = new ListNode(2);
        ListNode headASecondNode = new ListNode(6);
        ListNode headAThirdNode = new ListNode(4);

        ListNode headBFirstNode = new ListNode(1);
        ListNode headBSecondNode = new ListNode(5);

        // Link List
        headAFirstNode.next = headASecondNode;
        headASecondNode.next = headAThirdNode;

        headBFirstNode.next = headBSecondNode;

        ListNode results;
        results = IntersectionOfTwoLinkedLists.getIntersectionNode(headAFirstNode, headBFirstNode);
        Assertions.assertNull(results);
    }
}