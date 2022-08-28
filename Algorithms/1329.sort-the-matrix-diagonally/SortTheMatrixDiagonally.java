class SortTheMatrixDiagonally {
    private void pass(int[][] a, int row, int col, int n, int m) {
        int[] arr = new int[101];
        int i = row, j = col;
        while (row < n && col < m) {
            arr[a[row++][col++]]++;
        }
        for (int k = 0; k < 101; k++) {
            if (arr[k] > 0) {
                while (arr[k] != 0) {
                    a[i++][j++] = k;
                    arr[k]--;
                }
            }
        }
    }

    public int[][] diagonalSort(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int count = 0, i = 0, k = 0;
        while (count < row + col) {
            if (i == row - 1 && k < col) k++;
            if (i != row - 1) i++;
            pass(mat, row - 1 - i, k, row, col);
            count++;
        }
        return mat;
    }
}