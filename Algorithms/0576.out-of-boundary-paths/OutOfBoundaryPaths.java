class OutOfBoundaryPaths {
    private Long[][][] memo = null;
    private final int mod = (int) Math.pow(10, 9) + 7;

    private long findPathsHelper(int m, int n, int maxMove, int row, int col) {
        if (maxMove < 0) return 0;
        if (row == m || col == n || row == -1 || col == -1) return 1;
        if (memo[row][col][maxMove] != null) return memo[row][col][maxMove];

        long leftMaxMoveReduced = findPathsHelper(m, n, maxMove - 1, row, col - 1);
        long rightMaxMoveReduced = findPathsHelper(m, n, maxMove - 1, row,col + 1);
        long upMaxMovedReduced = findPathsHelper(m, n, maxMove - 1, row - 1, col);
        long downMaxMovedReduced = findPathsHelper(m, n, maxMove - 1, row + 1, col);

        long total = (leftMaxMoveReduced + rightMaxMoveReduced + upMaxMovedReduced + downMaxMovedReduced) % mod;
        memo[row][col][maxMove] = total;
        return total;
    }

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        memo = new Long[m + 1][n + 1][maxMove + 1];
        return (int) findPathsHelper(m, n, maxMove, startRow, startColumn);
    }
}