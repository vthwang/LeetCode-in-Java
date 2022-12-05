# [876. Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)

Given the `head` of a singly linked list, return _the middle node of the linked list_.

If there are two middle nodes, return **the second middle** node.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/07/23/lc-midlist1.jpg)

```
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/07/23/lc-midlist2.jpg)

```
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
```

## Solutions
### [Array](./MiddleOfTheLinkedList.java)

Idea: Save the head into array one by one, then return the middle ListNode.

```java
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode[] a = new ListNode[100];
        int cnt = 0;
        while (head != null) {
            a[cnt++] = head;
            head = head.next;
        }
        return a[cnt / 2];
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of the LinkedList.
- Space Complexity: $O(n)$.

### [Single Pointer](./MiddleOfTheLinkedList2.java)

Idea: we can iterate loop twice and get the middle point. In the second iteration, return the expected LinkedList.

```java
class Solution {
    public ListNode middleNode(ListNode head) {
        int cnt = 0;
        ListNode curr = head;
        while (curr != null) {
            cnt++;
            curr = curr.next;
        }
        int i = 0;
        curr = head;
        while (i < cnt / 2) {
            i++;
            curr = curr.next;
        }
        return curr;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of the LinkedList.
- Space Complexity: $O(1)$.

### [Two Pointers](./MiddleOfTheLinkedList3.java)

Idea: Use two pointers, `slow` and `fast`. `slow` takes one step at a time and `fast` takes two steps at a time. When `fast` is in the end, `slow` must be in the middle.

```java
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of the LinkedList.
- Space Complexity: $O(1)$.