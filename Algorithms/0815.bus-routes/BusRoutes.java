import java.awt.*;
import java.util.*;
import java.util.List;

class BusRoutes {
    private boolean intersect(int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) return true;
            if (a[i] < b[j]) i++;
            else j++;
        }
        return false;
    }

    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) return 0;
        int n = routes.length;

        List<List<Integer>> graph = new ArrayList<>();
        for (int[] route : routes) {
            Arrays.sort(route);
            graph.add(new ArrayList<>());
        }
        Set<Integer> seen = new HashSet<>();
        Set<Integer> targets = new HashSet<>();
        Queue<Point> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intersect(routes[i], routes[j])) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (Arrays.binarySearch(routes[i], source) >= 0) {
                seen.add(i);
                queue.offer(new Point(i, 0));
            }
            if (Arrays.binarySearch(routes[i], target) >= 0) {
                targets.add(i);
            }
        }

        while (!queue.isEmpty()) {
            Point info = queue.poll();
            int node = info.x, depth = info.y;
            if (targets.contains(node)) return depth + 1;
            for (Integer nei : graph.get(node)) {
                if (!seen.contains(nei)) {
                    seen.add(nei);
                    queue.offer(new Point(nei, depth + 1));
                }
            }
        }

        return -1;
    }
}