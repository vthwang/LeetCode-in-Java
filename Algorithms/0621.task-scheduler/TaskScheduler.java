import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;
        Map<Character, Integer> map = new HashMap<>();
        for (char task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(map.values());
        int maxFreq = pq.poll();
        int totalIdleTime = (maxFreq - 1) * n;
        while (!pq.isEmpty()) {
            int currentFreq = pq.poll();
            totalIdleTime -= currentFreq;
            if (currentFreq == maxFreq) {
                totalIdleTime += 1;
            }
        }

        if (totalIdleTime > 0) return totalIdleTime + tasks.length;
        else return tasks.length;
    }
}