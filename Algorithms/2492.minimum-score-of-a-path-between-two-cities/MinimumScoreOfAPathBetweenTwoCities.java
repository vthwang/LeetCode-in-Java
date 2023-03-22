import java.util.ArrayList;
import java.util.List;

class MinimumScoreOfAPathBetweenTwoCities {
    int res = Integer.MAX_VALUE;

    public int minScore(int n, int[][] roads) {
        List<List<int[]>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] road : roads) {
            int s = road[0] - 1;
            int d = road[1] - 1;
            int weight = road[2];
            list.get(s).add(new int[]{d, weight});
            list.get(d).add(new int[]{s, weight});
        }
        boolean[] visited = new boolean[n];
        dfs(list, 0, visited);
        return res;
    }

    private void dfs(List<List<int[]>> list, int start, boolean[] visited) {
        if (visited[start]) {
            return;
        }
        visited[start] = true;
        for (int[] next : list.get(start)) {
            if (res > next[1]) {
                res = next[1];
            }
            dfs(list, next[0], visited);
        }
    }
}