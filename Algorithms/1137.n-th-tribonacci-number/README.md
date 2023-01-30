# [1137. N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/)

The Tribonacci sequence Tn is defined as follows:

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn \+ Tn+1 \+ Tn+2 for n >= 0.

Given `n`, return the value of Tn.

**Example 1:**

```
Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
```

**Example 2:**

```
Input: n = 25
Output: 1389537
```

## Solutions
### [Optimized Dynamic Programming](NThTribonacciNumber.java)

Idea: We just need to memorize the previous three numbers, and it use three constant numbers instead of an array to save the space.

```java
class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        int first = 0, second = 1, third = 1;
        for (int i = 3; i <= n; i++) {
            int temp = first + second + third;
            first = second;
            second = third;
            third = temp;
        }
        return third;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$.
- Space Complexity: $O(1)$.
