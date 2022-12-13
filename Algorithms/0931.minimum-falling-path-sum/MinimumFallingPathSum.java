class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        for (int r = n - 2; r >= 0; r--) {
            for (int c = 0; c < n; c++) {
                int min = matrix[r + 1][c];
                if (c > 0)
                    min = Math.min(min, matrix[r + 1][c - 1]);
                if (c + 1 < n)
                    min = Math.min(min, matrix[r + 1][c + 1]);
                matrix[r][c] += min;
            }
        }
        int res = Integer.MAX_VALUE;
        for (int num : matrix[0])
            res = Math.min(res, num);
        return res;
    }
}