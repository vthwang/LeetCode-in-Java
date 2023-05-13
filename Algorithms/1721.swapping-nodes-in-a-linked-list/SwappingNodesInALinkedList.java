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
class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head, first = head, last = head;
        int count = 1;
        while (curr.next != null) {
            if (count < k) {
                first = first.next;
            } else {
                last = last.next;
            }
            count++;
            curr = curr.next;
        }
        int temp = first.val;
        first.val = last.val;
        last.val = temp;
        return head;
    }
}