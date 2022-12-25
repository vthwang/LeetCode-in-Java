# [2389. Longest Subsequence With Limited Sum](https://leetcode.com/problems/longest-subsequence-with-limited-sum/)

You are given an integer array `nums` of length `n`, and an integer array `queries` of length `m`.

Return _an array_ `answer` _of length_ `m` _where_ `answer[i]` _is the **maximum** size of a **subsequence** that you can take from_ `nums` _such that the **sum** of its elements is less than or equal to_ `queries[i]`.

A **subsequence** is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

**Example 1:**

```
Input: nums = [4,5,2,1], queries = [3,10,21]
Output: [2,3,4]
Explanation: We answer the queries as follows:
- The subsequence [2,1] has a sum less than or equal to 3. It can be proven that 2 is the maximum size of such a subsequence, so answer[0] = 2.
- The subsequence [4,5,1] has a sum less than or equal to 10. It can be proven that 3 is the maximum size of such a subsequence, so answer[1] = 3.
- The subsequence [4,5,2,1] has a sum less than or equal to 21. It can be proven that 4 is the maximum size of such a subsequence, so answer[2] = 4.
```

**Example 2:**

```
Input: nums = [2,3,4,5], queries = [1]
Output: [0]
Explanation: The empty subsequence is the only subsequence that has a sum less than or equal to 1, so answer[0] = 0.
```

## Solutions
### [Sort and Count](LongestSubsequenceWithLimitedSum.java)

Idea: Sort the `nums`, then find the maximum length of subsequence by deducting the lowest number from `nums`.

```java
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int m = queries.length;
        int[] ans = new int[m];
        Arrays.sort(nums);

        for (int i = 0; i < m; i++) {
            int count = 0, query = queries[i];
            for (int num : nums) {
                if (query >= num) {
                    count++;
                    query -= num;
                } else
                    break;
            }
            ans[i] = count;
        }
        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(m \times n + n \log n)$. Two for loops with $m$ and $n$ length. Also, sort takes $n\log n$. In total, the time complexity is $O(m\times n+n\log n)$.
- Space Complexity: $O(\log n)$. Java uses Quick sort, so the space complexity is $O(\log n)$.

### [Prefix Sum + Binary Search](LongestSubsequenceWithLimitedSum2.java)

Idea: Get the prefix sum with sorted `nums`. Then, iterate over `queries` and get the index from prefix sum by using binary search.

```java
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];

        int m = queries.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int index = binarySearch(nums, queries[i]);
            ans[i] = index;
        }
        return ans;
    }

    private int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid + 1;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return nums[left] > target ? left : left + 1;
    }
}
```

Complexity Analysis:

- Time Complexity: $O((m+n)\times \log n)$. Sort `nums` takes $O(n \times \log n)$. In the iterations, query $m$ elements with binary search is $O(m \times \log n)$. The total time complexity is $O((m+n))\times \log n)$.
- Space Complexity: $O(\log n)$. Java uses Quick sort, so the space complexity is $O(\log n)$.
