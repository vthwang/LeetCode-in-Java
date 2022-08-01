import java.util.Arrays;

class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] cached = new int[m][n];
        for (int i = 0; i < m; i++) {
            cached[i][n - 1] = 1;
        }
        Arrays.fill(cached[m-1], 1);

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                if (cached[i][j] == 0) {
                    cached[i][j] = cached[i + 1][j] + cached[i][j + 1];
                }
            }
        }

        return cached[0][0];
    }
}