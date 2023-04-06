class NumberOfClosedIslands {
    private int m, n;
    private int res = 0;
    private final int[] dx = {-1, 0, 1, 0};
    private final int[] dy = {0, 1, 0, -1};

    public int closedIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        if (m <= 2 || n <= 2) return 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (grid[i][j] == 0)
                    if (dfs(grid, i, j)) res++;
            }
        }

        return res;
    }

    private boolean dfs(int[][] grid, int x, int y) {
        if ((x == 0 || x == m - 1 || y == 0 || y == n - 1) && grid[x][y] == 0) {
            return false;
        }
        boolean f = true;
        grid[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int x1 = x + dx[i], y1 = y + dy[i];
            if (x1 < 0 || x1 >= m || y1 < 0 || y1 >= n || grid[x1][y1] == 1) continue;
            f = f & dfs(grid, x1, y1);
        }
        return f;
    }
}