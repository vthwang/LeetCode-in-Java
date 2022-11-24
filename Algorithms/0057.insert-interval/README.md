# [57. Insert Interval](https://leetcode.com/problems/insert-interval/)

You are given an array of non-overlapping intervals `intervals` where `intervals[i] = [start<sub>i</sub>, end<sub>i</sub>]` represent the start and the end of the `i<sup>th</sup>` interval and `intervals` is sorted in ascending order by `start<sub>i</sub>`. You are also given an interval `newInterval = [start, end]` that represents the start and end of another interval.

Insert `newInterval` into `intervals` such that `intervals` is still sorted in ascending order by `start<sub>i</sub>` and `intervals` still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return `intervals` _after the insertion_.

**Example 1:**

```
Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
```

**Example 2:**

```
Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
```

## Solutions
### [Simulation](./InsertInterval.java)

Idea: We just need to deal with the insert interval, the intervals outside the range of insert interval, we just put it in the list. For those intervals within the range of insert interval, we need to merge them together.

```java
class Solution {
   public int[][] insert(int[][] intervals, int[] newInterval) {
      List<int[]> ansList = new ArrayList<>();
      int i = 0;

      // add all the intervals before newInterval starts
      while (i < intervals.length && intervals[i][1] < newInterval[0]) {
         ansList.add(intervals[i]);
         i++;
      }

      // merge intervals with the insert interval
      while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
         newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
         newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
         i++;
      }
      ansList.add(newInterval);

      // add the rest of intervals
      while (i < intervals.length) {
         ansList.add(intervals[i]);
         i++;
      }

      int[][] ans = new int[ansList.size()][2];
      for (int j = 0; j < ansList.size(); j++)
         ans[j] = ansList.get(j);

      return ans;
   }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of intervals.
- Space Complexity: $O(1)$. We only use extra space for variables.
