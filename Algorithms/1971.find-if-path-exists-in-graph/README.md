# [1971. Find if Path Exists in Graph](https://leetcode.com/problems/find-if-path-exists-in-graph/)

There is a **bi-directional** graph with `n` vertices, where each vertex is labeled from `0` to `n - 1` ( **inclusive**). The edges in the graph are represented as a 2D integer array `edges`, where each `edges[i] = [u<sub>i</sub>, v<sub>i</sub>]` denotes a bi-directional edge between vertex `u<sub>i</sub>` and vertex `v<sub>i</sub>`. Every vertex pair is connected by **at most one** edge, and no vertex has an edge to itself.

You want to determine if there is a **valid path** that exists from vertex `source` to vertex `destination`.

Given `edges` and the integers `n`, `source`, and `destination`, return `true` _if there is a **valid path** from_ `source` _to_ `destination` _, or_ `false` _otherwise_ _._

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/08/14/validpath-ex1.png)

```
Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
Output: true
Explanation: There are two paths from vertex 0 to vertex 2:
- 0 → 1 → 2
- 0 → 2
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/08/14/validpath-ex2.png)

```
Input: n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
Output: false
Explanation: There is no path from vertex 0 to vertex 5.
```

## Solutions
### [BFS](FindIfPathExistsInGraph.java)

Idea: We just simply iterate all edges in the graph from source to destination. First, we set source vertex is true and put it into queue. Every time, we get all edges from the first queue and set next vertex as visited. When queue is empty or vertex equals destination, we stop the iteration. Finally, return the status of destination.

```java
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1];
            adj[x].add(y);
            adj[y].add(x);
        }
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        visited[source] = true;
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            if (vertex == destination) break;
            for (int next : adj[vertex]) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }
        return visited[destination];
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+m)$. $n$ is the number of vertices and $m$ is the edges of the graph.
- Space Complexity: $O(n+m)$. We use queue to save $n$ size of vertices and use a List array to save $m$ edges. Also, we use an $n$ size array to save the status of vertices. The total space complexity is $O(2n+m)=O(n+m)$.

### [DFS](FindIfPathExistsInGraph2.java)

Idea: We iterate all vertices with DFS, we iterate the next vertex first instead of iterate all edges of one vertex.

```java
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1];
            adj[x].add(y);
            adj[y].add(x);
        }
        boolean[] visited = new boolean[n];
        return dfs(source, destination, adj, visited);
    }

    private boolean dfs(int source, int destination, List<Integer>[] adj, boolean[] visited) {
        if (source == destination) return true;
        visited[source] = true;
        for (int next : adj[source]) {
            if (!visited[next] && dfs(next, destination, adj, visited))
                return true;
        }
        return false;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+m)$. $n$ is the number of vertices and $m$ is the edges of the graph.
- Space Complexity: $O(n+m)$. We use recursion and it saves $n$ size of vertices into stack, and use a List array to save $m$ edges. Also, we use an $n$ size array to save the status of vertices. The total space complexity is $O(2n+m)=O(n+m)$.

### [Union Find](FindIfPathExistsInGraph3.java)

Idea: If the source and destination are in the same disjoint set, they can be connected.

```java
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;
        UnionFind uf = new UnionFind(n);
        for (int[] edge : edges)
            uf.uni(edge[0], edge[1]);
        return uf.connect(source, destination);
    }
}

class UnionFind {
    private final int[] parent;
    private final int[] rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++)
            parent[i] = i;
    }

    public void uni(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY])
                parent[rootY] = rootX;
            else if (rank[rootX] < rank[rootY])
                parent[rootX] = rootY;
            else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }

    public int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    public boolean connect(int x, int y) {
        return find(x) == find(y);
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+m \times \alpha(m))$. $n$ is the number of vertices and $m$ is the edges of the graph. The time complexity of find and merge in union find is $O(\alpha(m))$.
- Space Complexity: $O(n)$. The space complexity of union find is $O(n)$ which is the number of vertices.
