import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String keyString = String.valueOf(chars);
            if (!map.containsKey(keyString)) map.put(keyString, new ArrayList<>());
            map.get(keyString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}