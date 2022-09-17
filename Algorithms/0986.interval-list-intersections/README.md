# [986. Interval List Intersections](https://leetcode.com/problems/interval-list-intersections/)

You are given two lists of closed intervals, `firstList` and `secondList`, where `firstList[i] = [start<sub>i</sub>, end<sub>i</sub>]` and `secondList[j] = [start<sub>j</sub>, end<sub>j</sub>]`. Each list of intervals is pairwise **disjoint** and in **sorted order**.

Return _the intersection of these two interval lists_.

A **closed interval** `[a, b]` (with `a <= b`) denotes the set of real numbers `x` with `a <= x <= b`.

The **intersection** of two closed intervals is a set of real numbers that are either empty or represented as a closed interval. For example, the intersection of `[1, 3]` and `[2, 4]` is `[2, 3]`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2019/01/30/interval1.png)

```
Input: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
```

**Example 2:**

```
Input: firstList = [[1,3],[5,9]], secondList = []
Output: []
```

## Solutions
1. [Two Pointers](./IntervalListIntersections.java)
    - Runtime: faster than 37.11%.
    - Memory usage: less than 48.12%
