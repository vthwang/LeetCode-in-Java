import java.util.Arrays;

class BestTeamWithNoConflicts {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++)
            order[i] = i;
        Arrays.sort(order, (a, b) -> ages[a] == ages[b] ? scores[a] - scores[b] : ages[a] - ages[b]);
        int[] dp = new int[n];
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            int currI = order[i];
            dp[i] = scores[currI];
            for (int j = 0; j < i; j++) {
                int currJ = order[j];
                if (scores[currI] >= scores[currJ])
                    dp[i] = Math.max(dp[i], dp[j] + scores[currI]);
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}