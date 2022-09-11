import java.util.Arrays;
import java.util.PriorityQueue;

class MaximumPerformanceOfATeam {
    private final int modulo = (int) (Math.pow(10, 9) + 7);

    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] order = new int[n][2];
        for (int i = 0; i < n; i++) {
            order[i] = new int[]{efficiency[i], speed[i]};
        }
        Arrays.sort(order, (a, b) -> Integer.compare(b[0], a[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long totalSpeed = 0, best = 0;
        for (int[] pair : order) {
            int spd = pair[1];
            pq.add(spd);
            if (pq.size() <= k) totalSpeed += spd;
            else totalSpeed += spd - pq.poll();
            best = Math.max(best, totalSpeed * pair[0]);
        }
        return (int) (best % modulo);
    }
}