import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CountAndSay {
    private String freqToString(List<List<Integer>> freq) {
        StringBuilder s = new StringBuilder();
        for (List<Integer> ints : freq) {
            for (Integer integer : ints) {
                s.append(Character.getNumericValue(integer + 48));
            }
        }
        return s.toString();
    }

    private String countFrequency(int n, List<List<Integer>> freq) {
        String freqString = freqToString(freq);
        if (n == 1) return freqString;
        List<List<Integer>> newFreq = new ArrayList<>();
        int freqCount = 0;
        char prevChar = freqString.charAt(0);
        for (char c : freqString.toCharArray()) {
            if (prevChar != c) {
                newFreq.add(Arrays.asList(freqCount, prevChar - 48));
                freqCount = 0;
                prevChar = c;
            }
            freqCount++;
        }
        newFreq.add(Arrays.asList(freqCount, prevChar - 48));
        n -= 1;
        return countFrequency(n, newFreq);
    }

    public String countAndSay(int n) {
        if (n <= 0) return "";
        if (n == 1) return "1";
        List<List<Integer>> frequency = new ArrayList<>();
        frequency.add(Arrays.asList(1, 1));
        return countFrequency(n - 1, frequency);
    }
}