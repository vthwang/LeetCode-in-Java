import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersIiTest {
    AddTwoNumbersIi AddTwoNumbersIi = new AddTwoNumbersIi();

    @Test
    void Example1() {
        ListNode list1FirstNode = new ListNode(7);
        ListNode list1SecondNode = new ListNode(2);
        ListNode list1ThirdNode = new ListNode(4);
        ListNode list1ForthNode = new ListNode(3);

        ListNode list2FirstNode = new ListNode(5);
        ListNode list2SecondNode = new ListNode(6);
        ListNode list2ThirdNode = new ListNode(4);

        list1FirstNode.next = list1SecondNode;
        list1SecondNode.next = list1ThirdNode;
        list1ThirdNode.next = list1ForthNode;

        list2FirstNode.next = list2SecondNode;
        list2SecondNode.next = list2ThirdNode;

        ListNode results = AddTwoNumbersIi.addTwoNumbers(list1FirstNode, list2FirstNode);

        ListNode resultFirstNode = new ListNode(7);
        ListNode resultSecondNode = new ListNode(8);
        ListNode resultThirdNode = new ListNode(0);
        ListNode resultForthNode = new ListNode(7);

        resultFirstNode.next = resultSecondNode;
        resultSecondNode.next = resultThirdNode;
        resultThirdNode.next = resultForthNode;

        ListNode expectedResultHead = resultFirstNode;
        ListNode resultsHead = results;
        while (expectedResultHead.next != null) {
            Assertions.assertEquals(expectedResultHead.val, resultsHead.val);
            expectedResultHead = expectedResultHead.next;
            resultsHead = resultsHead.next;
        }
    }

    @Test
    void Example2() {
        ListNode list1FirstNode = new ListNode(2);
        ListNode list1SecondNode = new ListNode(4);
        ListNode list1ThirdNode = new ListNode(3);

        ListNode list2FirstNode = new ListNode(5);
        ListNode list2SecondNode = new ListNode(6);
        ListNode list2ThirdNode = new ListNode(4);

        list1FirstNode.next = list1SecondNode;
        list1SecondNode.next = list1ThirdNode;

        list2FirstNode.next = list2SecondNode;
        list2SecondNode.next = list2ThirdNode;

        ListNode results = AddTwoNumbersIi.addTwoNumbers(list1FirstNode, list2FirstNode);

        ListNode resultFirstNode = new ListNode(8);
        ListNode resultSecondNode = new ListNode(0);
        ListNode resultThirdNode = new ListNode(7);

        resultFirstNode.next = resultSecondNode;
        resultSecondNode.next = resultThirdNode;

        ListNode expectedResultHead = resultFirstNode;
        ListNode resultsHead = results;
        while (expectedResultHead.next != null) {
            Assertions.assertEquals(expectedResultHead.val, resultsHead.val);
            expectedResultHead = expectedResultHead.next;
            resultsHead = resultsHead.next;
        }
    }

    @Test
    void Example3() {
        ListNode list1FirstNode = new ListNode(0);
        ListNode list2FirstNode = new ListNode(0);

        ListNode results = AddTwoNumbersIi.addTwoNumbers(list1FirstNode, list2FirstNode);

        ListNode expectedResultHead = new ListNode(0);
        ListNode resultsHead = results;
        while (expectedResultHead.next != null) {
            Assertions.assertEquals(expectedResultHead.val, resultsHead.val);
            expectedResultHead = expectedResultHead.next;
            resultsHead = resultsHead.next;
        }
    }
}
