# [2390. Removing Stars From a String](https://leetcode.com/problems/removing-stars-from-a-string/)

You are given a string `s`, which contains stars `*`.

In one operation, you can:

- Choose a star in `s`.
- Remove the closest **non-star** character to its **left**, as well as remove the star itself.

Return _the string after **all** stars have been removed_.

**Note:**

- The input will be generated such that the operation is always possible.
- It can be shown that the resulting string will always be unique.

**Example 1:**

```
Input: s = "leet**cod*e"
Output: "lecoe"
Explanation: Performing the removals from left to right:
- The closest character to the 1<sup>st</sup> star is 't' in "lee<u>t</u>**cod*e". s becomes "lee*cod*e".
- The closest character to the 2<sup>nd</sup> star is 'e' in "le<u>e</u>*cod*e". s becomes "lecod*e".
- The closest character to the 3<sup>rd</sup> star is 'd' in "leco<u>d</u>*e". s becomes "lecoe".
There are no more stars, so we return "lecoe".
```

**Example 2:**

```
Input: s = "erase*****"
Output: ""
Explanation: The entire string is removed, so we return an empty string.
```

## Solutions
### Stack

Idea: Iterate all characters in String and remove the character from the stack if met `*`. Then, pop out all characters from the string.

```java
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '*' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.insert(0, stack.pop());
        }

        return res.toString();
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `s`.
- Space Complexity: $O(n)$. Stack costs $O(n)$ space complexity.
