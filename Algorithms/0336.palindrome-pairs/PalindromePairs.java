import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class PalindromePairs {
    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        if (words == null || words.length == 0) return res;

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(new StringBuilder(words[i]).reverse().toString(), i);
        }

        if (map.containsKey("")) {
            int blankIdx = map.get("");
            for (int i = 0; i < words.length; i++) {
                if (i != blankIdx && isPalindrome(words[i])) {
                    res.add(Arrays.asList(blankIdx, i));
                    res.add(Arrays.asList(i, blankIdx));
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            Integer reverseIdx = map.get(words[i]);
            if (reverseIdx != null && reverseIdx != i) {
                res.add(Arrays.asList(i, reverseIdx));
            }
        }

        for (int i = 0; i < words.length; i++) {
            String cur = words[i];
            for (int cut = 1; cut < cur.length(); cut++) {
                String left = cur.substring(0, cut);
                String right = cur.substring(cut);

                if (map.containsKey(right) && isPalindrome(left)) {
                    res.add(Arrays.asList(map.get(right), i));
                }

                if (map.containsKey(left) && isPalindrome(right)) {
                    res.add(Arrays.asList(i, map.get(left)));
                }
            }
        }

        return res;
    }
}