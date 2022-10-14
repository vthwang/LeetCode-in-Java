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
class DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        int count = 0;
        ListNode countList = head;
        while (countList != null) {
            count++;
            countList = countList.next;
        }
        countList = head;
        for (int i = 0; i < count / 2 - 1; i++) {
            countList = countList.next;
        }
        countList.next = countList.next.next;
        return head;
    }
}