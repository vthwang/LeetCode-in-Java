import java.util.TreeSet;

class MaxSumOfRectangleNoLargerThanK {
    private int find(int[] sum, int k) {
        int res = Integer.MIN_VALUE;
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        int prefixSum = 0;
        for (int j : sum) {
            prefixSum += j;
            Integer target = set.ceiling(prefixSum - k);
            if (target != null) res = Math.max(res, prefixSum - target);
            set.add(prefixSum);
        }
        return res;
    }

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            int[] colSum = new int[col];
            for (int j = i; j < row; j++) {
                for (int c = 0; c < col; c++) {
                    colSum[c] += matrix[j][c];
                }
                max = Math.max(max, find(colSum, k));
            }
        }
        return max;
    }
}