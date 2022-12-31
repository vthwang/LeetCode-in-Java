import java.util.HashMap;
import java.util.Map;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<String, Character> str2ch = new HashMap<>();
        Map<Character, String> ch2str = new HashMap<>();
        int n = s.length(), i = 0;
        for (int p = 0; p < pattern.length(); p++) {
            char currentPattern = pattern.charAt(p);
            if (i >= n) return false;
            int j = i;
            while (j < n && s.charAt(j) != ' ') {
                j++;
            }
            String word = s.substring(i, j);
            if (str2ch.containsKey(word) && str2ch.get(word) != currentPattern)
                return false;
            if (ch2str.containsKey(currentPattern) && !word.equals(ch2str.get(currentPattern)))
                return false;
            str2ch.put(word, currentPattern);
            ch2str.put(currentPattern, word);
            i = j + 1;
        }
        return i >= n;
    }
}