import java.util.Collections;
import java.util.PriorityQueue;

class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(stones.length, Collections.reverseOrder());
        for (int stone : stones) {
            pq.add(stone);
        }
        while (!pq.isEmpty() && pq.size() != 1) {
            int first = pq.poll();
            int second = pq.size() >= 1 ? pq.poll() : 0;
            if (first != second) pq.add(first - second);
        }
        return pq.size() == 0 ? 0 : pq.poll();
    }
}