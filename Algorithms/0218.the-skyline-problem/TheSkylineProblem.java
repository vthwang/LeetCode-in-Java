import java.util.*;

class TheSkylineProblem {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> res = new ArrayList<>();
        List<int[]> height = new ArrayList<>();
        for (int[] b : buildings) {
            height.add(new int[]{b[0], -b[2]});
            height.add(new int[]{b[1], b[2]});
        }
        height.sort((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        pq.offer(0);
        int prev = 0;
        for (int[] h : height) {
            if (h[1] < 0) pq.offer(-h[1]);
            else pq.remove(h[1]);
            int cur = pq.peek() != null ? pq.peek() : 0;
            if (prev != cur) {
                res.add(Arrays.asList(h[0], cur));
                prev = cur;
            }
        }
        return res;
    }
}