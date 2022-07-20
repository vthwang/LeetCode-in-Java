import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class NumberOfMatchingSubsequences {
    public int numMatchingSubseq(String s, String[] words) {
        Map<Character, Queue<String>> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            map.putIfAbsent(s.charAt(i), new LinkedList<>());
        }

        for (String word : words) {
            char startChar = word.charAt(0);
            if (map.containsKey(startChar)) {
                map.get(startChar).offer(word);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char startChar = s.charAt(i);
            Queue<String> q = map.get(startChar);
            int size = q.size();
            for (int j = 0; j < size; j++) {
                String str = q.poll();
                if (str != null) {
                    if (str.substring(1).length() == 0) ans++;
                    else {
                        if (map.containsKey(str.charAt(1))) {
                            map.get(str.charAt(1)).add(str.substring(1));
                        }
                    }
                }
            }
        }
        return ans;
    }
}