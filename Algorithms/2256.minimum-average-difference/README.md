# [2256. Minimum Average Difference](https://leetcode.com/problems/minimum-average-difference/)

You are given a **0-indexed** integer array `nums` of length `n`.

The **average difference** of the index `i` is the **absolute** **difference** between the average of the **first** `i + 1` elements of `nums` and the average of the **last** `n - i - 1` elements. Both averages should be **rounded down** to the nearest integer.

Return _the index with the **minimum average difference**_. If there are multiple such indices, return the **smallest** one.

**Note:**

- The **absolute difference** of two numbers is the absolute value of their difference.
- The **average** of `n` elements is the **sum** of the `n` elements divided ( **integer division**) by `n`.
- The average of `0` elements is considered to be `0`.

**Example 1:**

```
Input: nums = [2,5,3,9,5,3]
Output: 3
Explanation:
- The average difference of index 0 is: |2 / 1 - (5 + 3 + 9 + 5 + 3) / 5| = |2 / 1 - 25 / 5| = |2 - 5| = 3.
- The average difference of index 1 is: |(2 + 5) / 2 - (3 + 9 + 5 + 3) / 4| = |7 / 2 - 20 / 4| = |3 - 5| = 2.
- The average difference of index 2 is: |(2 + 5 + 3) / 3 - (9 + 5 + 3) / 3| = |10 / 3 - 17 / 3| = |3 - 5| = 2.
- The average difference of index 3 is: |(2 + 5 + 3 + 9) / 4 - (5 + 3) / 2| = |19 / 4 - 8 / 2| = |4 - 4| = 0.
- The average difference of index 4 is: |(2 + 5 + 3 + 9 + 5) / 5 - 3 / 1| = |24 / 5 - 3 / 1| = |4 - 3| = 1.
- The average difference of index 5 is: |(2 + 5 + 3 + 9 + 5 + 3) / 6 - 0| = |27 / 6 - 0| = |4 - 0| = 4.
The average difference of index 3 is the minimum average difference so return 3.
```

**Example 2:**

```
Input: nums = [0]
Output: 0
Explanation:
The only index is 0 so return 0.
The average difference of index 0 is: |0 / 1 - 0| = |0 - 0| = 0.
```

## Solutions
### [Prefix Sum + Suffix Sum](./MinimumAverageDifference.java)

Idea: Create two arrays sum from the first element and the last element. Then we get the prefix and suffix sum without calculating every time. We can get the average difference by |(prefix sum / index) -  (suffix sum / n - 1 - index)|. Finally, return the minimum average difference.

```java
class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long[] prefixSum = new long[n + 1];
        long[] suffixSum = new long[n + 1];
        int ans = -1;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
            prefixSum[i + 1] = prefixSum[i] + nums[i];

        for (int i = n - 1; i >= 0; i--)
            suffixSum[i] = suffixSum[i + 1] + nums[i];

        for (int i = 0; i < n; i++) {
            long leftAverage = prefixSum[i + 1];
            leftAverage /= (i + 1);

            long rightAverage = suffixSum[i + 1];
            if (i != n -1)
                rightAverage /= (n - 1 - i);

            int currDifference = (int) Math.abs(leftAverage - rightAverage);
            if (currDifference < minDiff) {
                minDiff = currDifference;
                ans = i;
            }
        }
        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `nums` array.
- Space Complexity: $O(n)$. Create two arrays is $O(2n)$ space complexity. The total space complexity is $O(n)$.

### [Prefix Sum optimized](./MinimumAverageDifference2.java)

Idea: Calculate total sum at first and keep tracking the prefix sum. Then we can get the suffix sum by (total sum - prefix sum). And we can get the results without creating two extra arrays.

```java
class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int minDiff = Integer.MAX_VALUE;
        long currPrefixSum = 0;

        long totalSum = 0;
        for (int i = 0; i < n; i++)
            totalSum += nums[i];

        for (int i = 0; i < n; i++) {
            currPrefixSum += nums[i];

            long leftAverage = currPrefixSum;
            leftAverage /= (i + 1);

            long rightAverage = totalSum - currPrefixSum;
            if (i != n - 1)
                rightAverage /= (n - 1 - i);

            int currDifference = (int) Math.abs(leftAverage - rightAverage);
            if (currDifference < minDiff) {
                minDiff = currDifference;
                ans = i;
            }
        }
        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `nums` array.
- Space Complexity: $O(1)$. We only used some integer variables. The space complexity is constant.
