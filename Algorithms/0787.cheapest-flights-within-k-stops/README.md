# [787. Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/)

There are `n` cities connected by some number of flights. You are given an array `flights` where `flights[i] = [from<sub>i</sub>, to<sub>i</sub>, price<sub>i</sub>]` indicates that there is a flight from city `from<sub>i</sub>` to city `to<sub>i</sub>` with cost `price<sub>i</sub>`.

You are also given three integers `src`, `dst`, and `k`, return _**the cheapest price** from_ `src` _to_ `dst` _with at most_ `k` _stops._ If there is no such route, return `-1`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/03/18/cheapest-flights-within-k-stops-3drawio.png)

```
Input: n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1
Output: 700
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 3 is marked in red and has cost 100 + 600 = 700.
Note that the path through cities [0,1,2,3] is cheaper but is invalid because it uses 2 stops.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/03/18/cheapest-flights-within-k-stops-1drawio.png)

```
Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
Output: 200
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 2 is marked in red and has cost 100 + 100 = 200.
```

**Example 3:**

![](https://assets.leetcode.com/uploads/2022/03/18/cheapest-flights-within-k-stops-2drawio.png)

```
Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0
Output: 500
Explanation:
The graph is shown above.
The optimal path with no stops from city 0 to 2 is marked in red and has cost 500.
```

## Solutions
### [Dynamic Programming](CheapestFlightsWithinKStops.java)

Idea: We use `f[t][i]` to represent the minimum cost of using `t` flights and from `src` to `i` city. We can only change flights for `k` times, so the final answer is minimum value of `f[1][dst],f[2][dst]...f[k+1][dst]`.

```java
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        final int inf = 10000 * 101 + 1;
        int[][] f = new int[k + 2][n];
        for (int i = 0; i < k + 2; i++)
            Arrays.fill(f[i], inf);
        f[0][src] = 0;
        for (int t = 1; t <= k + 1; t++) {
            for (int[] flight : flights) {
                int j = flight[0], i = flight[1], cost = flight[2];
                f[t][i] = Math.min(f[t][i], f[t - 1][j] + cost);
            }
        }
        int ans = inf;
        for (int t = 1; t <= k + 1; t++)
            ans = Math.min(ans, f[t][dst]);

        return ans == inf ? -1 : ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O((m+n)\times k)$. $m$ is the length of `flights`. We first use $O(nk)$ to generate the `f` array, and use $O(mk)$ to iterate all `flights`. Thus, the total time complexity is $O(m+n)\times k)$.
- Space Complexity: $O(nk)$. The size of `f` is $O(nk)$.
