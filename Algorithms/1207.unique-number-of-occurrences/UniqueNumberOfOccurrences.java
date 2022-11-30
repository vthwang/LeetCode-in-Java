import java.util.Arrays;

class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] + 1000]++;
        }
        Arrays.sort(freq);

        for (int i = 0; i < 2000; i++) {
            if (freq[i] != 0 && freq[i] == freq[i + 1])
                return false;
        }
        return true;
    }
}