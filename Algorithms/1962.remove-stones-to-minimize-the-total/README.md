# [1962. Remove Stones to Minimize the Total](https://leetcode.com/problems/remove-stones-to-minimize-the-total/)

You are given a **0-indexed** integer array `piles`, where `piles[i]` represents the number of stones in the `i<sup>th</sup>` pile, and an integer `k`. You should apply the following operation **exactly** `k` times:

- Choose any `piles[i]` and **remove** `floor(piles[i] / 2)` stones from it.

**Notice** that you can apply the operation on the **same** pile more than once.

Return _the **minimum** possible total number of stones remaining after applying the_ `k` _operations_.

`floor(x)` is the **greatest** integer that is **smaller** than or **equal** to `x` (i.e., rounds `x` down).

**Example 1:**

```
Input: piles = [5,4,9], k = 2
Output: 12
Explanation: Steps of a possible scenario are:
- Apply the operation on pile 2. The resulting piles are [5,4,<u>5</u>].
- Apply the operation on pile 0. The resulting piles are [<u>3</u>,4,5].
The total number of stones in [3,4,5] is 12.
```

**Example 2:**

```
Input: piles = [4,3,6,7], k = 3
Output: 12
Explanation: Steps of a possible scenario are:
- Apply the operation on pile 2. The resulting piles are [4,3,<u>3</u>,7].
- Apply the operation on pile 3. The resulting piles are [4,3,3,<u>4</u>].
- Apply the operation on pile 0. The resulting piles are [<u>2</u>,3,3,4].
The total number of stones in [2,3,3,4] is 12.
```

## Solutions
### [Priority Queue](RemoveStonesToMinimizeTheTotal.java)

Idea: Move piles in a priority queue and then get the first item which is the largest. Remove the stone and put it back until k is running out.

```java
class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < piles.length; i++)
            pq.add(piles[i]);

        for (int i = 0; i < k; i++) {
            int stone = pq.remove();
            pq.add(stone - (stone / 2));
        }

        int stones = 0;
        for (int stone : pq)
            stones += stone;

        return stones;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n + k\log n)$. $n$ is the length of piles. Create priority queue and put piles to it cost $O(n)$. Moreover, add value and remove value cost $O(\log n)$. In the final step, calculate the result costs $O(n)$. The total time complexity is $O(2n+k\log n)=O(n + k\log n)$.
- Space Complexity: $O(n)$. The space complexity of priority queue is $O(n)$.
