import java.util.HashMap;
import java.util.Map;

class MinimumRoundsToCompleteAllTasks {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < tasks.length; i++)
            freq.put(tasks[i], freq.getOrDefault(tasks[i], 0) + 1);

        int ans = 0;
        for (int count : freq.values()) {
            if (count == 1)
                return -1;
            if (count % 3 == 0)
                ans += count / 3;
            else
                ans += count / 3 + 1;
        }

        return ans;
    }
}