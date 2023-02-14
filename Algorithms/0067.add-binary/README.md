# [67. Add Binary](https://leetcode.com/problems/add-binary/)

Given two binary strings `a` and `b`, return _their sum as a binary string_.

**Example 1:**

```
Input: a = "11", b = "1"
Output: "100"
```

**Example 2:**

```
Input: a = "1010", b = "1011"
Output: "10101"
```

## Solutions
### [Bit Manipulation](AddBinary.java)

Idea: We can iterate from right to left, add number together and put the carry to the next digit if the sum greater than 2.

```java
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; i++) {
            carry += i < a.length() ? a.charAt(a.length() - 1 - i) - '0' : 0;
            carry += i < b.length() ? b.charAt(b.length() - 1 - i) - '0' : 0;
            res.append((char) (carry % 2 + '0'));
            carry /= 2;
        }
        if (carry > 0)
            res.append('1');
        
        return res.reverse().toString();
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the maximum length of `a` and `b`.
- Space Complexity: $O(1)$.
