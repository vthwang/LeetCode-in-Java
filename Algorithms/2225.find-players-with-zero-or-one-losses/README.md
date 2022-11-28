# [2225. Find Players With Zero or One Losses](https://leetcode.com/problems/find-players-with-zero-or-one-losses/)

You are given an integer array `matches` where `matches[i] = [winner<sub>i</sub>, loser<sub>i</sub>]` indicates that the player `winner<sub>i</sub>` defeated player `loser<sub>i</sub>` in a match.

Return _a list_ `answer` _of size_ `2` _where:_

- `answer[0]` is a list of all players that have **not** lost any matches.
- `answer[1]` is a list of all players that have lost exactly **one** match.

The values in the two lists should be returned in **increasing** order.

**Note:**

- You should only consider the players that have played **at least one** match.
- The testcases will be generated such that **no** two matches will have the **same** outcome.

**Example 1:**

```
Input: matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
Output: [[1,2,10],[4,5,7,8]]
Explanation:
Players 1, 2, and 10 have not lost any matches.
Players 4, 5, 7, and 8 each have lost one match.
Players 3, 6, and 9 each have lost two matches.
Thus, answer[0] = [1,2,10] and answer[1] = [4,5,7,8].
```

**Example 2:**

```
Input: matches = [[2,3],[1,3],[5,4],[6,4]]
Output: [[1,2,5,6],[]]
Explanation:
Players 1, 2, 5, and 6 have not lost any matches.
Players 3 and 4 each have lost two matches.
Thus, answer[0] = [1,2,5,6] and answer[1] = [].
```

## Solutions
### [Hash Map](./FindPlayersWithZeroOrOneLosses.java)

Idea: Save all loss records to the hash map. If a user wins but does not show up in the hash map, we still need to save that record and mark it as 0, because we need to know that that user never lost.

```java
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> lossesCnt = new HashMap<>();

        for (int[] match : matches) {
            lossesCnt.put(match[0], lossesCnt.getOrDefault(match[0], 0));
            lossesCnt.put(match[1], lossesCnt.getOrDefault(match[1], 0) + 1);
        }

        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for (Integer player : lossesCnt.keySet()) {
            if (lossesCnt.get(player) == 0) {
                ans.get(0).add(player);
            } else if (lossesCnt.get(player) == 1) {
                ans.get(1).add(player);
            }
        }

        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));

        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. The iteration for saving data into map is $O(n)$ and the operations of getting data from hash map is $O(1)$. The sort is $O(n\log^n)$. The total runtime is $O(n\log^n)$.
- Space Complexity: $O(n)$. The hash map is $n$ size which is the length of matrix.
