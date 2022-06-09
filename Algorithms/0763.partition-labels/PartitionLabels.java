import java.util.ArrayList;
import java.util.List;

class PartitionLabels {
    private int char2Index(char c) {
        return c - 'a';
    }

    public List<Integer> partitionLabels(String s) {
        int[] lastIndexesOfChar = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndexesOfChar[char2Index(s.charAt(i))] = i;
        }
        List<Integer> partitions = new ArrayList<>();
        int firstIndex = 0;
        while (firstIndex < s.length()) {
            int lastIndex = firstIndex;
            for (int i = firstIndex; i < s.length() && i <= lastIndex; i++) {
                int index = lastIndexesOfChar[char2Index(s.charAt(i))];
                if (index > lastIndex) {
                    lastIndex = index;
                }
            }
            partitions.add(lastIndex - firstIndex + 1);
            firstIndex = lastIndex + 1;
        }
        return partitions;
    }
}