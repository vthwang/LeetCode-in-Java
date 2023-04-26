# [258. Add Digits](https://leetcode.com/problems/add-digits/)

Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it.

**Example 1:**

```
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.
```

**Example 2:**

```
Input: num = 0
Output: 0
```

## Solutions
### [Simulation](AddDigits.java)

Idea: Write the code as the question description.

```java
class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(\log n)$.
- Space Complexity: $O(1)$.
