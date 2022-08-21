import java.util.ArrayList;
import java.util.List;

class StampingTheSequence {
    private boolean canReplace(char[] tChars, int pos, char[] sChars) {
        for (int i = 0; i < sChars.length; i++) {
            if (tChars[i + pos] != '?' && tChars[i + pos] != sChars[i]) {
                return false;
            }
        }
        return true;
    }

    private int replace(char[] tChars, int pos, int len, int count) {
        for (int i = 0; i < len; i++) {
            if (tChars[i + pos] != '?') {
                tChars[i + pos] = '?';
                count++;
            }
        }
        return count;
    }

    public int[] movesToStamp(String stamp, String target) {
        char[] sChars = stamp.toCharArray();
        char[] tChars = target.toCharArray();
        int count = 0;
        boolean[] visited = new boolean[tChars.length];
        List<Integer> res = new ArrayList<>();

        while (count != tChars.length) {
            boolean didChange = false;
            for (int i = 0; i <= tChars.length - sChars.length; i++) {
                if (!visited[i] && canReplace(tChars, i, sChars)) {
                    count = replace(tChars, i, sChars.length, count);
                    visited[i] = true;
                    didChange = true;
                    res.add(i);

                    if (count == tChars.length) break;
                }
            }

            if (!didChange) return new int[0];
        }

        int[] result = new int[res.size()];
        int k = 0;
        for (int i = res.size() - 1; i >= 0; i--) {
            result[k++] = res.get(i);
        }

        return result;
    }
}