# [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)

Given the `head` of a singly linked list, return `true` if it is a palindrome.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/03/pal1linked-list.jpg)

```
Input: head = [1,2,2,1]
Output: true
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/03/03/pal2linked-list.jpg)

```
Input: head = [1,2]
Output: false
```

## Solutions
1. [Fast and slow pointer](./PalindromeLinkedList.java)
    - Cut the linked list into half and reverse the last part. Eventually, compare it's equal or not with the first part.
    - Runtime: faster than 38.57%.
    - Memory usage: less than 47.04%.
