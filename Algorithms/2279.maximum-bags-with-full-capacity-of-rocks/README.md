# [2279. Maximum Bags With Full Capacity of Rocks](https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/)

You have `n` bags numbered from `0` to `n - 1`. You are given two **0-indexed** integer arrays `capacity` and `rocks`. The `i<sup>th</sup>` bag can hold a maximum of `capacity[i]` rocks and currently contains `rocks[i]` rocks. You are also given an integer `additionalRocks`, the number of additional rocks you can place in **any** of the bags.

Return _the **maximum** number of bags that could have full capacity after placing the additional rocks in some bags._

**Example 1:**

```
Input: capacity = [2,3,4,5], rocks = [1,2,4,4], additionalRocks = 2
Output: 3
Explanation:
Place 1 rock in bag 0 and 1 rock in bag 1.
The number of rocks in each bag are now [2,3,4,4].
Bags 0, 1, and 2 have full capacity.
There are 3 bags at full capacity, so we return 3.
It can be shown that it is not possible to have more than 3 bags at full capacity.
Note that there may be other ways of placing the rocks that result in an answer of 3.
```

**Example 2:**

```
Input: capacity = [10,2,2], rocks = [2,2,0], additionalRocks = 100
Output: 3
Explanation:
Place 8 rocks in bag 0 and 2 rocks in bag 2.
The number of rocks in each bag are now [10,2,2].
Bags 0, 1, and 2 have full capacity.
There are 3 bags at full capacity, so we return 3.
It can be shown that it is not possible to have more than 3 bags at full capacity.
Note that we did not use all of the additional rocks.
```

## Solutions
### [Greedy](MaximumBagsWithFullCapacityOfRocks.java)

Idea: Put the remaining rocks in the capacity array, and sort it in descending order. Then find remove rock until additionRocks are running out.

```java
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        for (int i = 0; i < n; i++) {
            capacity[i] -= rocks[i];
        }
        Arrays.sort(capacity);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (additionalRocks < capacity[i]) return ans;
            additionalRocks -= capacity[i];
            ans++;
        }
        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n\log n)$. Get remaining rocks cost $O(n)$ and sort it cost $O(n\log n)$. Removing rocks to get the answer cost $O(n)$. The total time complexity is $O(n\log n)$.
- Space Complexity: $O(1)$. We only use some constant variables.
