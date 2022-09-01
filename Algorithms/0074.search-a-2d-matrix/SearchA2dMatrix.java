class SearchA2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = 0, j = 0;
        while (i < rows || j < cols) {
            if (matrix[i][j] == target) return true;
            if (i != rows - 1 && target >= matrix[i + 1][j]) {
                i++;
            } else if (j != cols - 1 && target >= matrix[i][j + 1]) {
                j++;
            } else {
                break;
            }
        }
        return false;
    }
}