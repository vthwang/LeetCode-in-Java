import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {
    MergeTwoSortedLists MergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    void Example1() {
        ListNode list1FirstNode = new ListNode(1);
        ListNode list1SecondNode = new ListNode(2);
        ListNode list1ThirdNode = new ListNode(4);

        ListNode list2FirstNode = new ListNode(1);
        ListNode list2SecondNode = new ListNode(3);
        ListNode list2ThirdNode = new ListNode(4);

        list1FirstNode.next = list1SecondNode;
        list1SecondNode.next = list1ThirdNode;

        list2FirstNode.next = list2SecondNode;
        list2SecondNode.next = list2ThirdNode;

        ListNode results = MergeTwoSortedLists.mergeTwoLists(list1FirstNode, list2FirstNode);

        list2FirstNode.next = list1FirstNode;
        list1FirstNode.next = list1SecondNode;
        list1SecondNode.next = list2SecondNode;
        list2SecondNode.next = list1ThirdNode;
        list1ThirdNode.next = list2ThirdNode;
        list2ThirdNode.next = null;

        Assertions.assertEquals(list2FirstNode, results);
    }

    @Test
    void Example2() {
        ListNode list1FirstNode = null;
        ListNode list2FirstNode = null;

        ListNode results = MergeTwoSortedLists.mergeTwoLists(list1FirstNode, list2FirstNode);

        Assertions.assertNull(results);
    }

    @Test
    void Example3() {
        ListNode list1FirstNode = null;
        ListNode list2FirstNode = new ListNode(0);

        ListNode results = MergeTwoSortedLists.mergeTwoLists(list1FirstNode, list2FirstNode);

        Assertions.assertEquals(list2FirstNode, results);
    }
}
