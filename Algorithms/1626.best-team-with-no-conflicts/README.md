# [1626. Best Team With No Conflicts](https://leetcode.com/problems/best-team-with-no-conflicts/)

You are the manager of a basketball team. For the upcoming tournament, you want to choose the team with the highest overall score. The score of the team is the **sum** of scores of all the players in the team.

However, the basketball team is not allowed to have **conflicts**. A **conflict** exists if a younger player has a **strictly higher** score than an older player. A conflict does **not** occur between players of the same age.

Given two lists, `scores` and `ages`, where each `scores[i]` and `ages[i]` represents the score and age of the `i<sup>th</sup>` player, respectively, return _the highest overall score of all possible basketball teams_.

**Example 1:**

```
Input: scores = [1,3,5,10,15], ages = [1,2,3,4,5]
Output: 34
Explanation: You can choose all the players.
```

**Example 2:**

```
Input: scores = [4,5,6,5], ages = [2,1,2,1]
Output: 16
Explanation: It is best to choose the last 3 players. Notice that you are allowed to choose multiple people of the same age.
```

**Example 3:**

```
Input: scores = [1,2,3,5], ages = [8,9,10,1]
Output: 6
Explanation: It is best to choose the first 3 players.
```

## Solutions
### [Dynamic Programming](BestTeamWithNoConflicts.java)

Idea: Create an order array in ascending order according to their ages, with scores if they are the same age. For every player, find the maximum score from the previous dp and update it as the current player’s dp.

```java
class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++)
            order[i] = i;
        Arrays.sort(order, (a, b) -> ages[a] == ages[b] ? scores[a] - scores[b] : ages[a] - ages[b]);
        int[] dp = new int[n];
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            int currI = order[i];
            dp[i] = scores[currI];
            for (int j = 0; j < i; j++) {
                int currJ = order[j];
                if (scores[currI] >= scores[currJ])
                    dp[i] = Math.max(dp[i], dp[j] + scores[currI]);
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n^2)$. $n$ is the length of `scores`.
- Space Complexity: $O(n)$. We use an extra array order, so the space complexity is $O(n)$.
