import java.util.HashMap;
import java.util.Map;

class NumberOfSubmatricesThatSumToTarget {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        int count = 0;

        for (int c1 = 0; c1 < col; c1++) {
            for (int c2 = c1; c2 < col; c2++) {
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                int sum = 0;

                for (int[] ints : matrix) {
                    sum += ints[c2] - (c1 > 0 ? ints[c1 - 1] : 0);
                    count += map.getOrDefault(sum - target, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }

        return count;
    }
}