import java.util.PriorityQueue;

class ConstructTargetArrayWithMultipleSums {
    public boolean isPossible(int[] target) {
        long sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int i = 0; i < target.length; i++) {
            sum += target[i];
            pq.offer(target[i]);
        }

        while (pq.peek() != 1) {
            int value = pq.poll();
            long diff = sum - value;
            if (diff == 1) return true;
            if (diff > value || diff == 0 || value % diff == 0) return false;

            value %= diff;
            sum = diff + value;
            pq.offer(value);
        }

        return true;
    }
}