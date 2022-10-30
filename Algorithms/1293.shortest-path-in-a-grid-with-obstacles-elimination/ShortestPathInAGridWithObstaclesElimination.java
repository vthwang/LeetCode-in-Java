import java.util.LinkedList;
import java.util.Queue;

class ShortestPathInAGridWithObstaclesElimination {
    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

    public int shortestPath(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        boolean[][][] visited = new boolean[m][n][k + 1];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, k});

        int dist = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                int[] curr = queue.remove();
                int x = curr[0];
                int y = curr[1];
                int obs = curr[2];
                if (x == m - 1 && y == n - 1 && obs >= 0) return dist;

                if (obs < 0 || visited[x][y][obs]) continue;
                visited[x][y][obs] = true;
                if (x - 1 >= 0) queue.add(new int[]{x - 1, y, obs - grid[x - 1][y]});
                if (x + 1 < m) queue.add(new int[]{x + 1, y, obs - grid[x + 1][y]});
                if (y - 1 >= 0) queue.add(new int[]{x, y - 1, obs - grid[x][y - 1]});
                if (y + 1 < n) queue.add(new int[]{x, y + 1, obs - grid[x][y + 1]});
            }
            dist++;
        }
        return -1;
    }
}