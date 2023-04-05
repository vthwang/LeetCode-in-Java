import java.util.HashMap;
import java.util.Map;

class OptimalPartitionOfString {
    public int partitionString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.clear();
                res++;
            }
            map.put(c, 1);
        }
        res++;
        return res;
    }
}