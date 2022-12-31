class UniquePathsIii {
    int ans = 0;
    int[] start;
    int totalSteps = 0;

    public int uniquePathsIII(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    start = new int[]{i, j};
                else
                    if (grid[i][j] != -1)
                        totalSteps++;
            }
        }
        findPath(start[0], start[1], 0, grid);
        return ans;
    }

    private void findPath(int i, int j, int step, int[][] grid) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == -1)
            return;
        if (grid[i][j] == 2) {
            if (totalSteps == step)
                ans++;
        } else {
            int g = grid[i][j];
            grid[i][j] = -1;
            findPath(i + 1, j, step + 1, grid);
            findPath(i - 1, j, step + 1, grid);
            findPath(i, j + 1, step + 1, grid);
            findPath(i, j - 1, step + 1, grid);
            grid[i][j] = g;
        }
    }
}