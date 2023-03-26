# [1466. Reorder Routes to Make All Paths Lead to the City Zero](https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/)

There are `n` cities numbered from `0` to `n - 1` and `n - 1` roads such that there is only one way to travel between two different cities (this network form a tree). Last year, The ministry of transport decided to orient the roads in one direction because they are too narrow.

Roads are represented by `connections` where `connections[i] = [a<sub>i</sub>, b<sub>i</sub>]` represents a road from city `a<sub>i</sub>` to city `b<sub>i</sub>`.

This year, there will be a big event in the capital (city `0`), and many people want to travel to this city.

Your task consists of reorienting some roads such that each city can visit the city `0`. Return the **minimum** number of edges changed.

It's **guaranteed** that each city can reach city `0` after reorder.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/05/13/sample_1_1819.png)

```
Input: n = 6, connections = [[0,1],[1,3],[2,3],[4,0],[4,5]]
Output: 3
Explanation: Change the direction of edges show in red such that each node can reach the node 0 (capital).
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/05/13/sample_2_1819.png)

```
Input: n = 5, connections = [[1,0],[1,2],[3,2],[3,4]]
Output: 2
Explanation: Change the direction of edges show in red such that each node can reach the node 0 (capital).
```

**Example 3:**

```
Input: n = 3, connections = [[1,0],[2,0]]
Output: 0
```

## Solutions
### [BFS](ReorderRoutesToMakeAllPathsLeadToTheCityZero.java)

Idea: We use BFS to iterate all cities and use levels to represent the path directions. Then, if the connection is from lower level to higher level, it means the connection needs to reroute, so add one to the result.

```java
class Solution {
    public int minReorder(int n, int[][] connections) {
        List<Integer>[] adjacentArray = new List[n];
        for (int i = 0; i < n; i++) {
            adjacentArray[i] = new ArrayList<>();
        }
        for (int[] connection : connections) {
            adjacentArray[connection[0]].add(connection[1]);
            adjacentArray[connection[1]].add(connection[0]);
        }
        int[] levels = new int[n];
        Arrays.fill(levels, -1);
        levels[0] = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(0);
        while (!queue.isEmpty()) {
            int city = queue.poll();
            List<Integer> adjacent = adjacentArray[city];
            for (int next : adjacent) {
                if (levels[next] < 0) {
                    levels[next] = levels[city] + 1;
                    queue.offer(next);
                }
            }
        }
        int res = 0;
        for (int[] connection : connections) {
            if (levels[connection[0]] < levels[connection[1]]) {
                res++;
            }
        }
        return res;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the city number. BFS costs $O(n)$ and iterate all paths costs  $O(n -1)$. The total time complexity is $O(2n-1)=O(n)$.
- Space Complexity: $O(n)$. Queue and array cost $O(n)$.
