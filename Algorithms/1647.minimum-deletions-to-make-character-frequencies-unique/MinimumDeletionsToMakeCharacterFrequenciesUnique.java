import java.util.HashSet;
import java.util.Set;

class MinimumDeletionsToMakeCharacterFrequenciesUnique {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        Set<Integer> set = new HashSet<>();
        int deletions = 0;
        for (int f : freq) {
            if (f == 0) {
                continue;
            }
            while (f > 0 && set.contains(f)) {
                f--;
                deletions++;
            }
            set.add(f);
        }

        return deletions;
    }
}