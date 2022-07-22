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
class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode lessStart = new ListNode(0);
        ListNode greaterStart = new ListNode(0);
        ListNode lessEnd = lessStart;
        ListNode greaterEnd = greaterStart;
        while (head != null) {
            if (head.val < x) {
                lessEnd.next = head;
                lessEnd = lessEnd.next;
            } else {
                greaterEnd.next = head;
                greaterEnd = greaterEnd.next;
            }
            head = head.next;
        }
        greaterEnd.next = null;
        lessEnd.next = greaterStart.next;
        return lessStart.next;
    }
}