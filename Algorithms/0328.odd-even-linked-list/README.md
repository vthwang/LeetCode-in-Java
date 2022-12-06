# [328. Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/)

Given the `head` of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return _the reordered list_.

The **first** node is considered **odd**, and the **second** node is **even**, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in `O(1)` extra space complexity and `O(n)` time complexity.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/10/oddeven-linked-list.jpg)

```
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/03/10/oddeven2-linked-list.jpg)

```
Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
```

## Solutions
### [LinkedList](./OddEvenLinkedList.java)

Idea: If the linkedList is empty, return empty directly. Create two pointers which point to odd and even list node respectively. Eventually, connect them together and return.

```java
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode evenHead = head.next;
        ListNode odd = head, even = evenHead;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of LinkedList.
- Space Complexity: $O(1)$. We only maintain constant pointers.
