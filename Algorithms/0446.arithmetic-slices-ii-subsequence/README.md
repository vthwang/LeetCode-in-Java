# [446. Arithmetic Slices II - Subsequence](https://leetcode.com/problems/arithmetic-slices-ii-subsequence/)

Given an integer array `nums`, return _the number of all the **arithmetic subsequences** of_ `nums`.

A sequence of numbers is called arithmetic if it consists of **at least three elements** and if the difference between any two consecutive elements is the same.

- For example, `[1, 3, 5, 7, 9]`, `[7, 7, 7, 7]`, and `[3, -1, -5, -9]` are arithmetic sequences.
- For example, `[1, 1, 2, 5, 7]` is not an arithmetic sequence.

A **subsequence** of an array is a sequence that can be formed by removing some elements (possibly none) of the array.

- For example, `[2,5,10]` is a subsequence of `[1,2,1,<strong><u>2</u></strong>,4,1,<u><strong>5</strong></u>,<u><strong>10</strong></u>]`.

The test cases are generated so that the answer fits in **32-bit** integer.

**Example 1:**

```
Input: nums = [2,4,6,8,10]
Output: 7
Explanation: All arithmetic subsequence slices are:
[2,4,6]
[4,6,8]
[6,8,10]
[2,4,6,8]
[4,6,8,10]
[2,4,6,8,10]
[2,6,10]
```

**Example 2:**

```
Input: nums = [7,7,7,7,7]
Output: 16
Explanation: Any subsequence of this array is arithmetic.
```

## Solutions
### [Dynamic Programming + Hash Table](./ArithmeticSlicesIiSubsequence.java)

Idea: We can define `f[i][d]` to represent the last element  is `nums[i]` and common difference is `d` in the sequence. Because the common difference is same, so we can add `nums[i]` to the sequence with the last element `nums[j]` . Thus, we can get the formula `f[i][d] += f[j][d] + 1`. Also, we can use Hash table to implement `f`.

```java
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans = 0;
        int n = nums.length;
        Map<Long, Integer>[] f = new Map[n];
        for (int i = 0; i < n; i++) {
            f[i] = new HashMap<>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                long d = (long) nums[i] - nums[j];
                int cnt = f[j].getOrDefault(d, 0);
                ans += cnt;
                f[i].put(d, f[i].getOrDefault(d, 0) + cnt + 1);
            }
        }
        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n^2)$. $n$ is the length of `nums`.
- Space Complexity: $O(n^2)$. `f` is a Map with $n$ length, and the map is saved `d` which has at most n size. In total, the space complexity is $O(n^2)$.
