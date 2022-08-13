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
class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        int count = 1;
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }
        int mid = count / 2 + 1;
        for (int i = 1; i < mid; i++) {
            head = head.next;
        }
        return head;
    }
}