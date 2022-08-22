import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;

        Map<Character, Integer> map = new HashMap<>();
        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int toBeMatched = map.size();
        int start = 0, end = 0;

        while (end < s.length()) {
            char eChar = s.charAt(end);
            if (map.containsKey(eChar)) {
                int count = map.get(eChar);
                if (count == 1) toBeMatched--;
                map.put(eChar, count - 1);
            }
            end++;

            if (end - start > p.length()) {
                char sChar = s.charAt(start);
                if (map.containsKey(sChar)) {
                    int count = map.get(sChar);
                    if (count == 0) toBeMatched++;
                    map.put(sChar, count + 1);
                }
                start++;
            }

            if (toBeMatched == 0) res.add(start);
        }

        return res;
    }
}