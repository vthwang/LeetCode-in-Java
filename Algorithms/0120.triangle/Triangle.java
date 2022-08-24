import java.util.Arrays;
import java.util.List;

class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()];
        dp[0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            int[] mem = dp.clone();
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    dp[j] = triangle.get(i).get(j) + mem[j];
                } else if (j == triangle.get(i).size() - 1) {
                    dp[j] = triangle.get(i).get(j) + mem[j - 1];
                } else {
                    dp[j] = triangle.get(i).get(j) + Math.min(mem[j], mem[j - 1]);
                }
            }
        }

        int res = Integer.MAX_VALUE;
        for (int num : dp) {
            res = Math.min(res, num);
        }
        return res;
    }
}