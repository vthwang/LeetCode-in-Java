# [904. Fruit Into Baskets](https://leetcode.com/problems/fruit-into-baskets/)

You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array `fruits` where `fruits[i]` is the **type** of fruit the `i<sup>th</sup>` tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

- You only have **two** baskets, and each basket can only hold a **single type** of fruit. There is no limit on the amount of fruit each basket can hold.
- Starting from any tree of your choice, you must pick **exactly one fruit** from **every** tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
- Once you reach a tree with fruit that cannot fit in your baskets, you must stop.

Given the integer array `fruits`, return _the **maximum** number of fruits you can pick_.

**Example 1:**

```
Input: fruits = [<u>1,2,1</u>]
Output: 3
Explanation: We can pick from all 3 trees.
```

**Example 2:**

```
Input: fruits = [0,<u>1,2,2</u>]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].
```

**Example 3:**

```
Input: fruits = [1,<u>2,3,2,2</u>]
Output: 4
Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].
```

## Solutions
### [Sliding Window + Hash Map](FruitIntoBaskets.java)

Idea: Use sliding window to iterate all trees and use a hash map to save all types of trees. If types is greater than 2, we must remove tree from the left. Then, return the max value of trees.

```java
class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer, Integer> cnt = new HashMap<>();

        int left = 0, res = 0;
        for (int right = 0; right < n; right++) {
            cnt.put(fruits[right], cnt.getOrDefault(fruits[right], 0) + 1);
            while (cnt.size() > 2) {
                cnt.put(fruits[left], cnt.get(fruits[left]) - 1);
                if (cnt.get(fruits[left]) == 0)
                    cnt.remove(fruits[left]);
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `fruits`.
- Space Complexity: $O(1)$. Hash map only has three key value pairs in maximum, so the total space complexity is constant.
