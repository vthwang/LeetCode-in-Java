# [540. Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/)

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return _the single element that appears only once_.

Your solution must run in `O(log n)` time and `O(1)` space.

**Example 1:**

```
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
```

**Example 2:**

```
Input: nums = [3,3,7,7,10,11,11]
Output: 10
```

## Solutions
### [Binary Search](SingleElementInASortedArray.java)

Idea: If mid value is odd and `nums[m - 1]` equals `nums[m]`, it means previous value are pairs. Also, if mid value is even and `nums[m]` equals `nums[m + 1]`, it means previous value are pairs, too. As the result, we can use binary search to find the single value without duplicate.

```java
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (m % 2 == 1)
                m--;
            if (nums[m] == nums[m + 1])
                l = m + 2;
            else
                h = m;
        }
        return nums[l];
    }
}
```

Complexity Analysis:

- Time Complexity: $O(\log n)$.
- Space Complexity: $O(1)$.
