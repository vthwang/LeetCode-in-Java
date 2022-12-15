# [232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)

Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue ( `push`, `peek`, `pop`, and `empty`).

Implement the `MyQueue` class:

- `void push(int x)` Pushes element x to the back of the queue.
- `int pop()` Removes the element from the front of the queue and returns it.
- `int peek()` Returns the element at the front of the queue.
- `boolean empty()` Returns `true` if the queue is empty, `false` otherwise.

**Notes:**

- You must use **only** standard operations of a stack, which means only `push to top`, `peek/pop from top`, `size`, and `is empty` operations are valid.
- Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.

**Example 1:**

```
Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false
```

## Solutions
### [Two stacks](ImplementQueueUsingStacks.java)

Idea: Create two stacks, one is output stack and one is input stack. When push data, put data into input stack. When pop and peek, get data into output stack. Every time, we pop or peek, we need to check the output stack is empty or not. If it’s empty, move data from the input stack.

```java
class MyQueue {
    Stack<Integer> inStack;
    Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    
    public void push(int x) {
        inStack.push(x);
    }
    
    public int pop() {
        in2out();
        return outStack.pop();
    }

    public int peek() {
        in2out();
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void in2out() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}
```

Complexity Analysis:

- Time Complexity: $O(1)$. push and empty are $O(1)$ and pop and peek are $O(1)$ in average. For each element, it will push and pop to the stacks twice, so the average time complexity is $O(1)$.
- Space Complexity: $O(n)$. $n$ is the size of the elements. We have $n$ elements in queue, so the space complexity is $O(n)$.
