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
class ReverseLinkedListIi {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        ListNode leftPrev = dummy;
        leftPrev.next = head;
        ListNode cur = head;
        for (int i = 1; i < left; i++) {
            leftPrev = leftPrev.next;
            cur = cur.next;
        }

        ListNode prev = null;
        for (int i = left; i <= right; i++) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        leftPrev.next.next = cur;
        leftPrev.next = prev;

        return dummy.next;
    }
}