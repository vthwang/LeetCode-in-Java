import java.util.LinkedList;
import java.util.Queue;

class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) queue.add(new int[] {i, j});
                else mat[i][j] = -1;
            }
        }
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int length = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            length++;
            while (size-- > 0 && queue.peek() != null) {
                int[] rc = queue.poll();
                for (int[] dir : dirs) {
                    int r = rc[0] + dir[0];
                    int c = rc[1] + dir[1];
                    if (r < 0 || c < 0 || r >= mat.length || c >= mat[0].length || mat[r][c] != -1) continue;
                    mat[r][c] = length;
                    queue.add(new int[]{r, c});
                }
            }
        }

        return mat;
    }
}