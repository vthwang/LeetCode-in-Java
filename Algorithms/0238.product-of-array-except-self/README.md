# [238. Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)

Given an integer array `nums`, return _an array_ `answer` _such that_ `answer[i]` _is equal to the product of all the elements of_ `nums` _except_ `nums[i]`.

The product of any prefix or suffix of `nums` is **guaranteed** to fit in a **32-bit** integer.

You must write an algorithm that runs in `O(n)` time and without using the division operation.

**Example 1:**

```
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
```

**Example 2:**

```
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
```

## Solutions
### [Left and right multiply list](./ProductOfArrayExceptSelf.java)

Idea: Start from the most left array and multiply by 1 to the end, also start from the most right and multiply by 1 to the start. Then we can get the answer from the multiply list from left multiply the multiply list from right.

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        left[0] = 1;
        for (int i = 1; i < n; i++)
            left[i] = left[i - 1] * nums[i - 1];
        
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--)
            right[i] = right[i + 1] * nums[i + 1];
        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++)
            ans[i] = left[i] * right[i];
        
        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `nums`.
- Space Complexity: $O(n)$. We have two extra array, left and right which is  $O(2n)$ and we can simplify to $O(n)$, $n$ is the length of `nums`.

### [Optimize Space Complexity](./ProductOfArrayExceptSelf2.java)

Idea: We can merge left array into ans array, and multiply right array back to ans array, too.

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        for (int i = 1; i < n; i++)
            ans[i] = ans[i - 1] * nums[i - 1];

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right *= nums[i];
        }

        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `nums`.
- Space Complexity: $O(1)$. We remove all of extra arrays, so the space complexity is constant.
