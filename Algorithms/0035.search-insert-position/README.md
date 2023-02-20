# [35. Search Insert Position](https://leetcode.com/problems/search-insert-position/)

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

**Example 1:**

```
Input: nums = [1,3,5,6], target = 5
Output: 2
```

**Example 2:**

```
Input: nums = [1,3,5,6], target = 2
Output: 1
```

**Example 3:**

```
Input: nums = [1,3,5,6], target = 7
Output: 4
```

## Solutions
### [Binary Search](SearchInsertPosition.java)

Idea: Use binary search to find the target.

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, h = nums.length;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] >= target) h = m;
            else l = m + 1;
        }
        return l;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(\log n)$. $n$ is the length of `nums`.
- Space Complexity: $O(1)$.
