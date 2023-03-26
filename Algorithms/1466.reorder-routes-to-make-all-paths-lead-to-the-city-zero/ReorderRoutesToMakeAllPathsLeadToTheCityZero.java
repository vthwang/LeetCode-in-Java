import java.util.*;

class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    public int minReorder(int n, int[][] connections) {
        List<Integer>[] adjacentArray = new List[n];
        for (int i = 0; i < n; i++) {
            adjacentArray[i] = new ArrayList<>();
        }
        for (int[] connection : connections) {
            adjacentArray[connection[0]].add(connection[1]);
            adjacentArray[connection[1]].add(connection[0]);
        }
        int[] levels = new int[n];
        Arrays.fill(levels, -1);
        levels[0] = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(0);
        while (!queue.isEmpty()) {
            int city = queue.poll();
            List<Integer> adjacent = adjacentArray[city];
            for (int next : adjacent) {
                if (levels[next] < 0) {
                    levels[next] = levels[city] + 1;
                    queue.offer(next);
                }
            }
        }
        int res = 0;
        for (int[] connection : connections) {
            if (levels[connection[0]] < levels[connection[1]]) {
                res++;
            }
        }
        return res;
    }
}