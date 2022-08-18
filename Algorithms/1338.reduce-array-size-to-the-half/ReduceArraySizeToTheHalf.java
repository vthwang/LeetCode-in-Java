import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class ReduceArraySizeToTheHalf {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> arrayList = new ArrayList<>(map.values());
        arrayList.sort(Collections.reverseOrder());

        int currentSize = 0, minimumSet = 0;
        while (currentSize < arr.length / 2) {
            currentSize += arrayList.remove(0);
            minimumSet++;
        }

        return minimumSet;
    }
}