# [1539. Kth Missing Positive Number](https://leetcode.com/problems/kth-missing-positive-number/)

Given an array `arr` of positive integers sorted in a **strictly increasing order**, and an integer `k`.

Return _the_ `k<sup>th</sup>` _**positive** integer that is **missing** from this array._

**Example 1:**

```
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5<sup>th</sup> missing positive integer is 9.
```

**Example 2:**

```
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2<sup>nd</sup> missing positive integer is 6.
```

## Solutions
### [Enumeration](KthMissingPositiveNumber.java)

Idea: Just iterate all numbers in array. Because the missing number must be greater or equal to k. Also, if the array number is less than or equal to k, it means we have one less missing number. Then, we can add one to k.

```java
class Solution {
    public int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k)
                k++;
        }
        return k;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `arr`.
- Space Complexity: $O(1)$.
