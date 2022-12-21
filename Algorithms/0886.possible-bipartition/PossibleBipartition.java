import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class PossibleBipartition {
    public boolean possibleBipartition(int n, int[][] dislikes) {
       int[] color = new int[n + 1];
       List<Integer>[] graph = new List[n + 1];
       for (int i = 0; i <= n; i++)
           graph[i] = new ArrayList<>();
       for (int[] edge : dislikes) {
           graph[edge[0]].add(edge[1]);
           graph[edge[1]].add(edge[0]);
       }
       for (int i = 1; i <= n; i++) {
           if (color[i] == 0) {
               Queue<Integer> queue = new ArrayDeque<>();
               queue.offer(i);
               color[i] = 1;
               while (!queue.isEmpty()) {
                   int curr = queue.poll();
                   for (int next : graph[curr]) {
                       if (color[next] > 0 && color[next] == color[curr])
                           return false;
                       if (color[next] == 0) {
                           color[next] = 3 ^ color[curr];
                           queue.offer(next);
                       }
                   }
               }
           }
       }
       return true;
    }
}