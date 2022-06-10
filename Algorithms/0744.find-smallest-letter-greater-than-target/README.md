# [744. Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)

Given a characters array `letters` that is sorted in **non-decreasing** order and a character `target`, return _the smallest character in the array that is larger than_ `target`.

**Note** that the letters wrap around.

- For example, if `target == 'z'` and `letters == ['a', 'b']`, the answer is `'a'`.

**Example 1:**

```
Input: letters = ["c","f","j"], target = "a"
Output: "c"
```

**Example 2:**

```
Input: letters = ["c","f","j"], target = "c"
Output: "f"
```

**Example 3:**

```
Input: letters = ["c","f","j"], target = "d"
Output: "f"
```

## Solutions
1. [Binary Search Algorithm](./FindSmallestLetterGreaterThanTarget.java)
    - Runtime: faster than 38.84%.
    - Memory usage: less than 34.56%
