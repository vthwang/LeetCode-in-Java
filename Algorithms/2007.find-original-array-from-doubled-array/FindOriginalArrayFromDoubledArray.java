import java.util.Arrays;
import java.util.HashMap;

class FindOriginalArrayFromDoubledArray {
    public int[] findOriginalArray(int[] changed) {
        int[] emptyArr = new int[0];
        int l = changed.length;
        if (l % 2 != 0) return emptyArr;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[l / 2];
        for (int j : changed) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        int temp = 0;
        Arrays.sort(changed);
        for (int num : changed) {
            if (map.get(num) <= 0) continue;
            if (map.getOrDefault(2 * num, 0) <= 0) return emptyArr;
            res[temp++] = num;
            map.put(num, map.get(num) - 1);
            map.put(2 * num, map.get(2 * num) - 1);
        }

        return res;
    }
}