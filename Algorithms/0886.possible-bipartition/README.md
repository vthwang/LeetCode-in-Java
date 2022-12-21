# [886. Possible Bipartition](https://leetcode.com/problems/possible-bipartition/)

We want to split a group of `n` people (labeled from `1` to `n`) into two groups of **any size**. Each person may dislike some other people, and they should not go into the same group.

Given the integer `n` and the array `dislikes` where `dislikes[i] = [a<sub>i</sub>, b<sub>i</sub>]` indicates that the person labeled `a<sub>i</sub>` does not like the person labeled `b<sub>i</sub>`, return `true` _if it is possible to split everyone into two groups in this way_.

**Example 1:**

```
Input: n = 4, dislikes = [[1,2],[1,3],[2,4]]
Output: true
Explanation: group1 [1,4] and group2 [2,3].
```

**Example 2:**

```
Input: n = 3, dislikes = [[1,2],[1,3],[2,3]]
Output: false
```

**Example 3:**

```
Input: n = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
Output: false
```

## Solutions
### [BFS](PossibleBipartition.java)

Idea: Use BFS and graph coloring to iterate all vertices. 0 means no group, 1 means group 1 and 2 means group 2.

```java
class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
       int[] color = new int[n + 1];
       List<Integer>[] graph = new List[n + 1];
       for (int i = 0; i <= n; i++)
           graph[i] = new ArrayList<>();
       for (int[] edge : dislikes) {
           graph[edge[0]].add(edge[1]);
           graph[edge[1]].add(edge[0]);
       }
       for (int i = 1; i <= n; i++) {
           if (color[i] == 0) {
               Queue<Integer> queue = new ArrayDeque<>();
               queue.offer(i);
               color[i] = 1;
               while (!queue.isEmpty()) {
                   int curr = queue.poll();
                   for (int next : graph[curr]) {
                       if (color[next] > 0 && color[next] == color[curr])
                           return false;
                       if (color[next] == 0) {
                           color[next] = 3 ^ color[curr];
                           queue.offer(next);
                       }
                   }
               }
           }
       }
       return true;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+m)$. $n$ is the number of people and $m$ is the array size of dislike.
- Space Complexity: $O(n+m)$. We iterate all people and dislike array and put it into queue, so the space complexity is $O(n+m)$.

### [DFS](PossibleBipartition2.java)

Idea: Use the graph coloring as the above.

```java
class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
       int[] color = new int[n + 1];
       List<Integer>[] graph = new List[n + 1];
       for (int i = 0; i <= n; i++)
           graph[i] = new ArrayList<>();
       for (int[] edges : dislikes) {
           graph[edges[0]].add(edges[1]);
           graph[edges[1]].add(edges[0]);
       }
       for (int i = 1; i <= n; i++) {
           if (color[i] == 0 && !dfs(i, 1, color, graph))
               return false;
       }
       return true;
    }

    private boolean dfs(int curr, int currColor, int[] color, List<Integer>[] graph) {
        color[curr] = currColor;
        for (int next : graph[curr]) {
            if (color[next] != 0 && color[next] == color[curr])
                return false;
            if (color[next] == 0 && !dfs(next, 3 ^ currColor, color, graph))
                return false;
        }
        return true;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+m)$. $n$ is the number of people and $m$ is the array size of dislike.
- Space Complexity: $O(n+m)$. We iterate all people and dislike array and put it into queue, so the space complexity is $O(n+m)$.
