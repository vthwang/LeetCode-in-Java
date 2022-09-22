import java.util.LinkedList;
import java.util.Queue;

class ShortestPathInBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return -1;
        int res = 0;

        int row = grid.length;
        int col = grid[0].length;

        if (grid[0][0] == 1 || grid[row - 1][col - 1] == 1) return -1;
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        boolean[][] visited = new boolean[row][col];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            res++;

            for (int i = 0; i < size; i++) {
                int[] curPos = queue.poll();
                if (curPos[0] == row - 1 && curPos[1] == col - 1) return res;
                for (int[] dir : directions) {
                    int nextX = curPos[0] + dir[0];
                    int nextY = curPos[1] + dir[1];
                    if (nextX < 0 || nextX >= row || nextY < 0 || nextY >= col || visited[nextX][nextY] || grid[nextX][nextY] == 1) continue;
                    visited[nextX][nextY] = true;
                    queue.offer(new int[]{nextX, nextY});
                }
            }
        }

        return -1;
    }
}