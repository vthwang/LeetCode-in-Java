# [2477. Minimum Fuel Cost to Report to the Capital](https://leetcode.com/problems/minimum-fuel-cost-to-report-to-the-capital/)

There is a tree (i.e., a connected, undirected graph with no cycles) structure country network consisting of `n` cities numbered from `0` to `n - 1` and exactly `n - 1` roads. The capital city is city `0`. You are given a 2D integer array `roads` where `roads[i] = [a<sub>i</sub>, b<sub>i</sub>]` denotes that there exists a **bidirectional road** connecting cities `a<sub>i</sub>` and `b<sub>i</sub>`.

There is a meeting for the representatives of each city. The meeting is in the capital city.

There is a car in each city. You are given an integer `seats` that indicates the number of seats in each car.

A representative can use the car in their city to travel or change the car and ride with another representative. The cost of traveling between two cities is one liter of fuel.

Return _the minimum number of liters of fuel to reach the capital city_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/09/22/a4c380025e3ff0c379525e96a7d63a3.png)

```
Input: roads = [[0,1],[0,2],[0,3]], seats = 5
Output: 3
Explanation:
- Representative<sub>1</sub> goes directly to the capital with 1 liter of fuel.
- Representative<sub>2</sub> goes directly to the capital with 1 liter of fuel.
- Representative<sub>3</sub> goes directly to the capital with 1 liter of fuel.
It costs 3 liters of fuel at minimum.
It can be proven that 3 is the minimum number of liters of fuel needed.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/11/16/2.png)

```
Input: roads = [[3,1],[3,2],[1,0],[0,4],[0,5],[4,6]], seats = 2
Output: 7
Explanation:
- Representative<sub>2</sub> goes directly to city 3 with 1 liter of fuel.
- Representative<sub>2</sub> and representative<sub>3</sub> go together to city 1 with 1 liter of fuel.
- Representative<sub>2</sub> and representative<sub>3</sub> go together to the capital with 1 liter of fuel.
- Representative<sub>1</sub> goes directly to the capital with 1 liter of fuel.
- Representative<sub>5</sub> goes directly to the capital with 1 liter of fuel.
- Representative<sub>6</sub> goes directly to city 4 with 1 liter of fuel.
- Representative<sub>4</sub> and representative<sub>6</sub> go together to the capital with 1 liter of fuel.
It costs 7 liters of fuel at minimum.
It can be proven that 7 is the minimum number of liters of fuel needed.
```

**Example 3:**

![](https://assets.leetcode.com/uploads/2022/09/27/efcf7f7be6830b8763639cfd01b690a.png)

```
Input: roads = [], seats = 1
Output: 0
Explanation: No representatives need to travel to the capital city.
```

## Solutions
### [DFS](MinimumFuelCostToReportToTheCapital.java)

Idea: Save all roads’ neighbors in a list. Since every edge costs one fuel, so we iterate all nodes and add fuel to the total fuels. We use `ceil` here because if the seats is 5, taking 4 or 5 people cost the same fuel.

```java
class Solution {
    long fuel;

    public long minimumFuelCost(int[][] roads, int seats) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int[] road : roads) {
            adj.computeIfAbsent(road[0], k -> new ArrayList<>()).add(road[1]);
            adj.computeIfAbsent(road[1], k -> new ArrayList<>()).add(road[0]);
        }
        dfs(0, -1, adj, seats);
        return fuel;
    }

    private long dfs(int node, int parent, Map<Integer, List<Integer>> adj, int seats) {
        int representatives = 1;
        if (!adj.containsKey(node))
            return representatives;
        for (int child : adj.get(node)) {
            if (child != parent)
                representatives += dfs(child, node, adj, seats);
        }
        if (node != 0)
            fuel += Math.ceil((double) representatives / seats);
        return representatives;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. We have $n$ nodes in the graph. We need to iterate $n$ times to save roads and $n$ times to find the representatives. The total time complexity is $O(2n)=O(n)$.
- Space Complexity: $O(n)$. The hash map costs $O(n)$ space and DFS is using stack and the worse case is $O(n)$. The total space complexity is $O(2n)=O(n)$.
