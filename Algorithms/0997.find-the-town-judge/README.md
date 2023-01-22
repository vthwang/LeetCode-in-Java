# [997. Find the Town Judge](https://leetcode.com/problems/find-the-town-judge/)

In a town, there are `n` people labeled from `1` to `n`. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

1. The town judge trusts nobody.
2. Everybody (except for the town judge) trusts the town judge.
3. There is exactly one person that satisfies properties **1** and **2**.

You are given an array `trust` where `trust[i] = [a<sub>i</sub>, b<sub>i</sub>]` representing that the person labeled `a<sub>i</sub>` trusts the person labeled `b<sub>i</sub>`.

Return _the label of the town judge if the town judge exists and can be identified, or return_ `-1` _otherwise_.

**Example 1:**

```
Input: n = 2, trust = [[1,2]]
Output: 2
```

**Example 2:**

```
Input: n = 3, trust = [[1,3],[2,3]]
Output: 3
```

**Example 3:**

```
Input: n = 3, trust = [[1,3],[2,3],[3,1]]
Output: -1
```

## Solutions
### [Array](FindTheTownJudge.java)

Idea: The judge is trusted  by others and don’t trust anyone. We only need to iterate all trust list, then find the person who has these two features.

```java
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] isTrusted = new int[n + 1];
        int[] trustOthers = new int[n + 1];
        for (int[] edge : trust) {
            trustOthers[edge[0]]++;
            isTrusted[edge[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (isTrusted[i] == n - 1 && trustOthers[i] == 0)
                return i;
        }
        return -1;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+m)$. $m$ is the length of `trust` array. We first iterate the `trust` array and iterate $n$ times to find the judge. The total time complexity is $O(n+m)$.
- Space Complexity: $O(n)$. We use two arrays to record trust other people and is trusted array. The total space complexity is $O(2n)=O(n)$.
