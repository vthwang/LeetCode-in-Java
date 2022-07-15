class MaxAreaOfIsland {
    private int maxAreaOfIslandHelper(int r, int c, int[][] grid) {
        if (r < 0 || r == grid.length || c < 0 || c == grid[0].length || grid[r][c] == 0) return 0;
        grid[r][c] = 0;
        return 1 + maxAreaOfIslandHelper(r + 1, c, grid)
                + maxAreaOfIslandHelper(r - 1, c , grid)
                + maxAreaOfIslandHelper(r, c + 1, grid)
                + maxAreaOfIslandHelper(r, c - 1, grid);
    }

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int area = maxAreaOfIslandHelper(i, j, grid);
                    if (area > maxArea) maxArea = area;
                }
            }
        }
        return maxArea;
    }
}