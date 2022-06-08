# [605. Can Place Flowers](https://leetcode.com/problems/can-place-flowers/)

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in **adjacent** plots.

Given an integer array `flowerbed` containing `0`'s and `1`'s, where `0` means empty and `1` means not empty, and an integer `n`, return _if_ `n` new flowers can be planted in the `flowerbed` without violating the no-adjacent-flowers rule.

**Example 1:**

```
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
```

**Example 2:**

```
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
```

## Solutions
1. [Greedy](./CanPlaceFlowers.java)
    - Runtime: faster than 36.30%.
    - Memory usage: less than 62.42%
