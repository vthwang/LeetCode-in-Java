class FindIfPathExistsInGraph3 {
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