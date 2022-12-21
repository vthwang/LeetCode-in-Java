import java.util.ArrayList;
import java.util.List;

class PossibleBipartition2 {
    public boolean possibleBipartition(int n, int[][] dislikes) {
       int[] color = new int[n + 1];
       List<Integer>[] graph = new List[n + 1];
       for (int i = 0; i <= n; i++)
           graph[i] = new ArrayList<>();
       for (int[] edges : dislikes) {
           graph[edges[0]].add(edges[1]);
           graph[edges[1]].add(edges[0]);
       }
       for (int i = 1; i <= n; i++) {
           if (color[i] == 0 && !dfs(i, 1, color, graph))
               return false;
       }
       return true;
    }

    private boolean dfs(int curr, int currColor, int[] color, List<Integer>[] graph) {
        color[curr] = currColor;
        for (int next : graph[curr]) {
            if (color[next] != 0 && color[next] == color[curr])
                return false;
            if (color[next] == 0 && !dfs(next, 3 ^ currColor, color, graph))
                return false;
        }
        return true;
    }
}