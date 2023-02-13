# [1523. Count Odd Numbers in an Interval Range](https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/)

Given two non-negative integers `low` and `<font face="monospace">high</font>`. Return the _count of odd numbers between_ `low` _and_ `<font face="monospace">high</font>` _(inclusive)_.

**Example 1:**

```
Input: low = 3, high = 7
Output: 3
<b>Explanation: </b>The odd numbers between 3 and 7 are [3,5,7].```

**Example 2:**

```
Input: low = 8, high = 10
Output: 1
<b>Explanation: </b>The odd numbers between 8 and 10 are [9].```

## Solutions
### [Math](CountOddNumbersInAnIntervalRange.java)

Idea: Make the low to odd number, then the amount of odd number is $\frac{high - low}{2} +1$.

```java
class Solution {
    public int countOdds(int low, int high) {
        if ((low & 1) == 0)
            low++;
        return low > high ? 0 : (high - low) / 2 + 1;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(1)$.
- Space Complexity: $O(1)$.
