class SurroundedRegions {
    private void DFS(char[][] board, int row, int col) {
        if (row < 0 || row > board.length - 1 || col < 0 || col > board[0].length) return;
        if (board[row][col] == 'O') board[row][col] = '*';
        if (row > 1 && board[row - 1][col] == 'O') DFS(board, row - 1, col);
        if (row < board.length - 2 && board[row + 1][col] == 'O') DFS(board, row + 1, col);
        if (col > 1 && board[row][col - 1] == 'O') DFS(board, row, col - 1);
        if (col < board[row].length - 2 && board[row][col + 1] == 'O') DFS(board, row, col + 1);
    }

    public void solve(char[][] board) {
        if (board.length < 2 || board[0].length < 2) return;
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') DFS(board, i, 0);
            if (board[i][n - 1] == 'O') DFS(board, i, n - 1);
        }
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') DFS(board, 0, j);
            if (board[m - 1][j] == 'O') DFS(board, m - 1, j);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == '*') board[i][j] = 'O';
            }
        }
    }
}