class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
        }
        for (int i = n - 1; i >= 0; i--) {
            sum += mat[i][n - 1 - i];
        }
        if (n % 2 == 0) {
            return sum;
        } else {
            int index = n / 2;
            sum -= mat[index][index];
        }
        return sum;
    }
}