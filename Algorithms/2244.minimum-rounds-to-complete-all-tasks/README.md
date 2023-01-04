# [2244. Minimum Rounds to Complete All Tasks](https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/)

You are given a **0-indexed** integer array `tasks`, where `tasks[i]` represents the difficulty level of a task. In each round, you can complete either 2 or 3 tasks of the **same difficulty level**.

Return _the **minimum** rounds required to complete all the tasks, or_ `-1` _if it is not possible to complete all the tasks._

**Example 1:**

```
Input: tasks = [2,2,3,3,2,4,4,4,4,4]
Output: 4
Explanation: To complete all the tasks, a possible plan is:
- In the first round, you complete 3 tasks of difficulty level 2.
- In the second round, you complete 2 tasks of difficulty level 3.
- In the third round, you complete 3 tasks of difficulty level 4.
- In the fourth round, you complete 2 tasks of difficulty level 4.
It can be shown that all the tasks cannot be completed in fewer than 4 rounds, so the answer is 4.
```

**Example 2:**

```
Input: tasks = [2,3,3]
Output: -1
Explanation: There is only 1 task of difficulty level 2, but in each round, you can only complete either 2 or 3 tasks of the same difficulty level. Hence, you cannot complete all the tasks, and the answer is -1.
```

## Solutions
### [Hash Map + Greedy](MinimumRoundsToCompleteAllTasks.java)

Idea: First, we put all tasks into hash map. Then, if count equals 0, it means the tasks cannot be done. Otherwise, if the task leaves the remainder of 0, we can get the rounds by dividing 3. If the task leaves the remainder of 1 or 2. The count will be $\frac{count}{3}+1$.

```java
class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < tasks.length; i++)
            freq.put(tasks[i], freq.getOrDefault(tasks[i], 0) + 1);

        int ans = 0;
        for (int count : freq.values()) {
            if (count == 1)
                return -1;
            if (count % 3 == 0)
                ans += count / 3;
            else
                ans += count / 3 + 1;
        }

        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of tasks.
- Space Complexity: $O(n)$. The size of hash map is $n$.
