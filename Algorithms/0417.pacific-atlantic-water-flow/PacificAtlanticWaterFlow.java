import java.util.*;

class PacificAtlanticWaterFlow {
    private void dfs(int[][] heights, int r, int c, boolean[][] visit, int prevHeight) {
        if (r < 0 || c < 0 || r == heights.length || c == heights[0].length || visit[r][c] || heights[r][c] < prevHeight) return;
        visit[r][c] = true;
        dfs(heights, r + 1, c, visit, heights[r][c]);
        dfs(heights, r - 1, c, visit, heights[r][c]);
        dfs(heights, r, c + 1, visit, heights[r][c]);
        dfs(heights, r, c - 1, visit, heights[r][c]);
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] pac = new boolean[rows][cols];
        boolean[][] atl = new boolean[rows][cols];

        for (int i = 0; i < cols; i++) {
            dfs(heights, 0, i, pac, heights[0][i]);
            dfs(heights, rows - 1, i, atl, heights[rows - 1][i]);
        }

        for (int i = 0; i < rows; i++) {
            dfs(heights, i, 0, pac, heights[i][0]);
            dfs(heights, i, cols - 1, atl, heights[i][cols - 1]);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pac[i][j] && atl[i][j]) res.add(Arrays.asList(i, j));
            }
        }
        return res;
    }
}