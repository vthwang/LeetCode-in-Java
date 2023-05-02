# [1822. Sign of the Product of an Array](https://leetcode.com/problems/sign-of-the-product-of-an-array/)

There is a function `signFunc(x)` that returns:

- `1` if `x` is positive.
- `-1` if `x` is negative.
- `0` if `x` is equal to `0`.

You are given an integer array `nums`. Let `product` be the product of all values in the array `nums`.

Return `signFunc(product)`.

**Example 1:**

```
Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
```

**Example 2:**

```
Input: nums = [1,5,0,2,-3]
Output: 0
Explanation: The product of all values in the array is 0, and signFunc(0) = 0
```

**Example 3:**

```
Input: nums = [-1,1,-1,1,-1]
Output: -1
Explanation: The product of all values in the array is -1, and signFunc(-1) = -1
```

## Solutions
### [Array](SignOfTheProductOfAnArray.java)

Idea: Just iterate the array, then, when the number is less than 0, change the sign. If there is number is 0 in `nums`. The answer will be 0 no matter what.

```java
class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for (int num: nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                sign *= -1;
            }
        }
        return sign;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `nums`.
- Space Complexity: $O(1)$.
