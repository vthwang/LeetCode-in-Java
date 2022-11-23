# [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.

**Example 1:**

```
Input: s = "()"
Output: true
```

**Example 2:**

```
Input: s = "()[]{}"
Output: true
```

**Example 3:**

```
Input: s = "(]"
Output: false
```

## Solutions
### [Stack](./ValidParentheses.java)

Idea: When we find left parenthesis, we can put it in the stack for later match. Then if we can find the right parenthesis for this left parenthesis, we’ll remove it from the stack. Otherwise, If the current character is right parenthesis and it cannot find the match in stack, we’ll return false. After the loop is completed, if the stack is not empty, we’ll return false as well.

Note: We can use hash table to eliminate many if-else conditions. Also, if the length is odd means it cannot be valid parentheses.

```java
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;

        Map<Character, Character> pairs = new HashMap<>(){{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (pairs.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(c))
                    return false;
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of s.
- Space Complexity: $O(n + m)$. $m$ is the size of hash table which is 6 in this question. The max amount of stack is $O(n)$, $n$ is the length of $s$.
