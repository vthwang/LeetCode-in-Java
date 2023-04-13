# [946. Validate Stack Sequences](https://leetcode.com/problems/validate-stack-sequences/)

Given two integer arrays `pushed` and `popped` each with distinct values, return `true` _if this could have been the result of a sequence of push and pop operations on an initially empty stack, or_ `false` _otherwise._

**Example 1:**

```
Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4),
pop() -> 4,
push(5),
pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
```

**Example 2:**

```
Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
Output: false
Explanation: 1 cannot be popped before 2.
```

## Solutions
### [Stack](ValidateStackSequences.java)

Idea: Create a stack to simulate the stack situations. If the number on the top stack is match with the current `popped` number, we can pop out the number and move on the next `popped` number. Then If we still have number in `pushed`, we just push it into the stack. If we can’t push the number and can’t find the match with the current popped number, it means it can’t be the result of a sequence of push and pop operations, return false.

```java
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pushIndex = 0, popIndex = 0;
        while (popIndex < popped.length) {
            if (stack.isEmpty() && pushIndex < pushed.length) {
                stack.push(pushed[pushIndex++]);
            } else if (stack.peek() == popped[popIndex]) {
                stack.pop();
                popIndex++;
            } else if (pushIndex < pushed.length) {
                stack.push(pushed[pushIndex++]);
            } else {
                return false;
            }
        }

        return true;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `pushed`, since `pushed` and `popped` has the length, so the time complexity is $O(n)$.
- Space Complexity: $O(n)$.
