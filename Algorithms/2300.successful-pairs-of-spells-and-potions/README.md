# [2300. Successful Pairs of Spells and Potions](https://leetcode.com/problems/successful-pairs-of-spells-and-potions/)

You are given two positive integer arrays `spells` and `potions`, of length `n` and `m` respectively, where `spells[i]` represents the strength of the `i<sup>th</sup>` spell and `potions[j]` represents the strength of the `j<sup>th</sup>` potion.

You are also given an integer `success`. A spell and potion pair is considered **successful** if the **product** of their strengths is **at least** `success`.

Return _an integer array_ `pairs` _of length_ `n` _where_ `pairs[i]` _is the number of **potions** that will form a successful pair with the_ `i<sup>th</sup>` _spell._

**Example 1:**

```
Input: spells = [5,1,3], potions = [1,2,3,4,5], success = 7
Output: [4,0,3]
Explanation:
- 0<sup>th</sup> spell: 5 * [1,2,3,4,5] = [5,<u>10</u>,<u>15</u>,<u>20</u>,<u>25</u>]. 4 pairs are successful.
- 1<sup>st</sup> spell: 1 * [1,2,3,4,5] = [1,2,3,4,5]. 0 pairs are successful.
- 2<sup>nd</sup> spell: 3 * [1,2,3,4,5] = [3,6,<u>9</u>,<u>12</u>,<u>15</u>]. 3 pairs are successful.
Thus, [4,0,3] is returned.
```

**Example 2:**

```
Input: spells = [3,1,2], potions = [8,5,8], success = 16
Output: [2,0,2]
Explanation:
- 0<sup>th</sup> spell: 3 * [8,5,8] = [<u>24</u>,15,<u>24</u>]. 2 pairs are successful.
- 1<sup>st</sup> spell: 1 * [8,5,8] = [8,5,8]. 0 pairs are successful.
- 2<sup>nd</sup> spell: 2 * [8,5,8] = [<u>16</u>,10,<u>16</u>]. 2 pairs are successful.
Thus, [2,0,2] is returned.
```

## Solutions
### [Binary Search](SuccessfulPairsOfSpellsAndPotions.java)

Idea: First, sort the `potions` and then use binary search to find the boundary of success. The right side of boundary are greater than `success`.

```java
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] res = new int[n];
        Arrays.sort(potions);
        for (int i = 0; i < n; i++) {
            int x = spells[i];
            int l = 0, r = m;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if ((long) x * potions[mid] >= success) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            if (l < m) {
                res[i] = m - l;
            }
        }
        return res;
    }
}
```

Complexity Analysis:

- Time Complexity: $O((n+m)\log n)$. Array sort costs $O(m\log n)$ and binary search for spells costs $O(m\log n)$.
- Space Complexity: $O(1)$.
