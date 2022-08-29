import java.util.HashMap;
import java.util.Map;

class LongestPalindromeByConcatenatingTwoLetterWords {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int unpaired = 0, res = 0;
        for (String word : words) {
            if (!map.containsKey(word)) map.put(word, 0);
            if (word.charAt(0) == word.charAt(1)) {
                if (map.get(word) > 0) {
                    unpaired--;
                    map.put(word, map.get(word) - 1);
                    res += 4;
                } else {
                    map.put(word, map.get(word) + 1);
                    unpaired++;
                }
            } else {
                String rev = Character.toString(word.charAt(1)) + Character.toString(word.charAt(0));
                if (map.containsKey(rev) && map.get(rev) > 0) {
                    res += 4;
                    map.put(rev, map.get(rev) - 1);
                } else {
                    map.put(word, map.get(word) + 1);
                }
            }
        }
        if (unpaired > 0) res += 2;
        return res;
    }
}