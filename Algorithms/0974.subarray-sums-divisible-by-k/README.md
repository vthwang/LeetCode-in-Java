# [974. Subarray Sums Divisible by K](https://leetcode.com/problems/subarray-sums-divisible-by-k/)

Given an integer array `nums` and an integer `k`, return _the number of non-empty **subarrays** that have a sum divisible by_ `k`.

A **subarray** is a **contiguous** part of an array.

**Example 1:**

```
Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
```

**Example 2:**

```
Input: nums = [5], k = 9
Output: 0
```

## Solutions
### [HashMap + PrefixSum](SubarraySumsDivisibleByK.java)

Idea: The idea of this question is suppose we have a subarray from $i$ to $j$ and the sum of it is divisible by $k$. Then we need to find the prefixSum before $i$ and the remainder is equal to `prefix[j] % k`. One possible subarray is from the first item to last item, so we need to add 1 to prefixSum 0. Moreover, the number in `nums` can be negative, so we can use `(num % k + k) % k` to make it as positive number.

```java
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        counter.put(0, 1);

        int prefixSum = 0, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remainder = (prefixSum % k + k) % k;
            int getCount = counter.getOrDefault(remainder, 0);
            ans += getCount;
            counter.put(remainder, getCount + 1);
        }
        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `nums`.
- Space Complexity: $O(k)$. $k$ is the maximum size of hash map.
