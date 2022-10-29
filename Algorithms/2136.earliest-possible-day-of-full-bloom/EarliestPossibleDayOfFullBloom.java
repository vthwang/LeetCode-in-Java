import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class EarliestPossibleDayOfFullBloom {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = growTime.length;
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < growTime.length; i++) {
            indices.add(i);
        }
        indices.sort(Comparator.comparingInt(i -> -growTime[i]));
        int result = 0;
        for (int i = 0, currPlantTime = 0; i < n; i++) {
            int index = indices.get(i);
            int time = currPlantTime + plantTime[index] + growTime[index];
            result = Math.max(result, time);
            currPlantTime += plantTime[index];
        }
        return result;
    }
}