/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int val = 0;
            if (l1 != null && l2 != null) {
                val = l1.val + l2.val;
            } else if (l1 != null) {
                val = l1.val;
            } else if (l2 != null ){
                val = l2.val;
            }
            val += carry;
            curr.next = new ListNode((val % 10));
            curr = curr.next;
            carry = val / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }
}