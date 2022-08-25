class WhereWillTheBallFall {
    public int[] findBall(int[][] grid) {
        int n = grid[0].length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int i1 = i, i2;
            for (int[] ints : grid) {
                i2 = i1 + ints[i1];
                if (i2 < 0 || i2 >= n || ints[i2] != ints[i1]) {
                    i1 = -1;
                    break;
                }
                i1 = i2;
            }
            res[i] = i1;
        }
        return res;
    }
}