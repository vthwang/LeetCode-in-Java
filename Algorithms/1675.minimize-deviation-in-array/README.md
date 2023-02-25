# [1675. Minimize Deviation in Array](https://leetcode.com/problems/minimize-deviation-in-array/)

You are given an array `nums` of `n` positive integers.

You can perform two types of operations on any element of the array any number of times:

- If the element is **even**, **divide** it by `2`.


  - For example, if the array is `[1,2,3,4]`, then you can do this operation on the last element, and the array will be `[1,2,3,<u>2</u>].`
- If the element is **odd**, **multiply** it by `2`.

  - For example, if the array is `[1,2,3,4]`, then you can do this operation on the first element, and the array will be `[<u>2</u>,2,3,4].`

The **deviation** of the array is the **maximum difference** between any two elements in the array.

Return _the **minimum deviation** the array can have after performing some number of operations._

**Example 1:**

```
Input: nums = [1,2,3,4]
Output: 1
Explanation: You can transform the array to [1,2,3,<u>2</u>], then to [<u>2</u>,2,3,2], then the deviation will be 3 - 2 = 1.
```

**Example 2:**

```
Input: nums = [4,1,5,20,3]
Output: 3
Explanation: You can transform the array after two operations to [4,<u>2</u>,5,<u>5</u>,3], then the deviation will be 5 - 2 = 3.
```

**Example 3:**

```
Input: nums = [2,10,8]
Output: 3
```

## Solutions
### [TreeSet](MinimizeDeviationInArray.java)

Idea: The minimum deviation is the largest value - the smallest value. So we can just keep reducing the current maximum value until it cannot be reduced.

```java
class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num % 2 == 0 ? num : num * 2);
        }
        int res = set.last() - set.first();
        while (res > 0 && set.last() % 2 == 0) {
            int max = set.last();
            set.remove(max);
            set.add(max / 2);
            res = Math.min(res, set.last() - set.first());
        }
        return res;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `nums`.
- Space Complexity: $O(n)$. We maintain at most $n$ numbers in the TreeSet.
