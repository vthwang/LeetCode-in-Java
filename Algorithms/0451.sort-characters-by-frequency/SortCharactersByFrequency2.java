import java.util.HashMap;
import java.util.Map;

class SortCharactersByFrequency2 {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        int maxFreq = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int frequency = freq.getOrDefault(c, 0) + 1;
            freq.put(c, frequency);
            maxFreq = Math.max(maxFreq, frequency);
        }

        StringBuilder[] buckets = new StringBuilder[maxFreq + 1];
        for (int i = 0; i <= maxFreq; i++)
            buckets[i] = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            buckets[frequency].append(c);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = maxFreq; i > 0; i--) {
            StringBuilder bucket = buckets[i];
            for (int j = 0; j < bucket.length(); j++) {
                for (int k = 0; k < i; k++) {
                    sb.append(bucket.charAt(j));
                }
            }
        }
        return sb.toString();
    }
}