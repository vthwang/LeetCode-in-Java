import java.util.HashMap;
import java.util.Map;

class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer, Integer> cnt = new HashMap<>();

        int left = 0, res = 0;
        for (int right = 0; right < n; right++) {
            cnt.put(fruits[right], cnt.getOrDefault(fruits[right], 0) + 1);
            while (cnt.size() > 2) {
                cnt.put(fruits[left], cnt.get(fruits[left]) - 1);
                if (cnt.get(fruits[left]) == 0)
                    cnt.remove(fruits[left]);
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}