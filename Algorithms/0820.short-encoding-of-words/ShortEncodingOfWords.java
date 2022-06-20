import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ShortEncodingOfWords {
    public int minimumLengthEncoding(String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        for (String s : words) {
            for (int i = 1; i < s.length(); i++) {
                wordSet.remove(s.substring(i));
            }
        }

        int length = 0;
        for (String s : wordSet) {
            length += s.length() + 1;
        }
        return length;
    }
}