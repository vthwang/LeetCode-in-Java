import java.util.LinkedList;
import java.util.Queue;

class NearestExitFromEntranceInMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length, cols = maze[0].length;
        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        int startRow = entrance[0], startCol = entrance[1];
        maze[startRow][startCol] = '+';

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startRow, startCol, 0});

        while (!queue.isEmpty()) {
            int[] currentState = queue.poll();
            int currRow = currentState[0], currCol = currentState[1], currDistance = currentState[2];

            for (int[] dir : dirs) {
                int nextRow = currRow + dir[0], nextCol = currCol + dir[1];

                if (0 <= nextRow && nextRow < rows && 0 <= nextCol && nextCol < cols && maze[nextRow][nextCol] == '.') {
                    if (nextRow == 0 || nextRow == rows - 1 || nextCol == 0 || nextCol == cols - 1)
                        return currDistance + 1;

                    maze[nextRow][nextCol] = '+';
                    queue.offer(new int[]{nextRow, nextCol, currDistance + 1});
                }
            }
        }

        return -1;
    }
}