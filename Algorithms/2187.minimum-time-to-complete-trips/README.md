# [2187. Minimum Time to Complete Trips](https://leetcode.com/problems/minimum-time-to-complete-trips/)

You are given an array `time` where `time[i]` denotes the time taken by the `i<sup>th</sup>` bus to complete **one trip**.

Each bus can make multiple trips **successively**; that is, the next trip can start **immediately after** completing the current trip. Also, each bus operates **independently**; that is, the trips of one bus do not influence the trips of any other bus.

You are also given an integer `totalTrips`, which denotes the number of trips all buses should make **in total**. Return _the **minimum time** required for all buses to complete **at least**_ `totalTrips` _trips_.

**Example 1:**

```
Input: time = [1,2,3], totalTrips = 5
Output: 3
Explanation:
- At time t = 1, the number of trips completed by each bus are [1,0,0].
  The total number of trips completed is 1 + 0 + 0 = 1.
- At time t = 2, the number of trips completed by each bus are [2,1,0].
  The total number of trips completed is 2 + 1 + 0 = 3.
- At time t = 3, the number of trips completed by each bus are [3,1,1].
  The total number of trips completed is 3 + 1 + 1 = 5.
So the minimum time needed for all buses to complete at least 5 trips is 3.
```

**Example 2:**

```
Input: time = [2], totalTrips = 1
Output: 2
Explanation:
There is only one bus, and it will complete its first trip at t = 2.
So the minimum time needed to complete 1 trip is 2.
```

## Solutions
### [Binary Search](MinimumTimeToCompleteTrips.java)

Idea: The lowest bound is 1 which means we have at least one trip. The highest bound is the total trips multiply the minimum value of time. Then, we can use binary search to find the minimum time to complete the total trips.

```java
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        long l = 1, r = 1L * totalTrips * time[0];
        while (l < r) {
            long mid = l + (r - l) / 2;
            if (check(mid, time, totalTrips)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean check(long currentTime, int[] time, int totalTrips) {
        long cnt = 0;
        for (int period : time) {
            if (period > currentTime) {
                break;
            }
            cnt += (currentTime / period);
        }
        return cnt >= totalTrips;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n\log(mk))$. $n$ is the length of `time` and $m$ equals to `totalTrips`. $k$ is the minimum value of `time`. Binary search costs $O(\log(mk))$ and check function costs $O(n)$. The total time complexity is $O(n\log(mk))$.
- Space Complexity: $O(1)$.
