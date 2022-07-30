import java.util.LinkedList;
import java.util.List;

class WordSubsets {
    private int[] count(String s) {
        int[] ans = new int[26];
        for (char c : s.toCharArray()) ans[c - 'a']++;
        return ans;
    }

    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] word2Max = count("");
        for (String word2 : words2) {
            int[] word2Count = count(word2);
            for (int i = 0; i < 26; i++) word2Max[i] = Math.max(word2Max[i], word2Count[i]);
        }

        List<String> ans = new LinkedList<>();
        search: for (String word1 : words1) {
            int[] word1Count = count(word1);
            for (int i = 0; i < 26; i++) {
                if (word1Count[i] < word2Max[i]) continue search;
            }
            ans.add(word1);
        }

        return ans;
    }
}