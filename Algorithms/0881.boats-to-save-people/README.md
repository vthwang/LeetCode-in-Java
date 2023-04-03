# [881. Boats to Save People](https://leetcode.com/problems/boats-to-save-people/)

You are given an array `people` where `people[i]` is the weight of the `i<sup>th</sup>` person, and an **infinite number of boats** where each boat can carry a maximum weight of `limit`. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most `limit`.

Return _the minimum number of boats to carry every given person_.

**Example 1:**

```
Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
```

**Example 2:**

```
Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
```

**Example 3:**

```
Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
```

## Solutions
### [Two pointers & Greedy](BoatsToSavePeople.java)

Idea: First we sort the people from the lightest to the heaviest. Then use two pointers method, the best solution for less boat is we put the heaviest and the lightest together.

```java
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res = 0;
        int l = 0, r = people.length - 1;
        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                l++;
            }
            r--;
            res++;
        }
        return res;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n\log n)$. $n$ is the length of `people`. Sorting costs $O(n\log n)$.
- Space Complexity: $O(\log n)$. Sorting costs $O(\log n)$.
