import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class SplitArrayIntoConsecutiveSubsequences {
    public boolean isPossible(int[] nums) {
        if (nums.length < 3) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(map.keySet().size());
        pq.addAll(map.keySet());

        while (!pq.isEmpty()) {
            int min = pq.peek();
            int count = 0;
            while (true) {
                if (!map.containsKey(min)) {
                    if (count < 3) return false;
                    break;
                }
                map.put(min, map.get(min) - 1);
                count++;
                if (map.get(min) == 0) {
                    if (pq.peek() != null && min != pq.peek()) return false;
                    pq.poll();
                }
                if (map.containsKey(min + 1) && map.get(min) + 1 > map.get(min + 1)) {
                    if (count < 3) return false;
                    break;
                }
                min++;
            }
        }
        return true;
    }
}