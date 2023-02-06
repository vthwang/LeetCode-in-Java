import java.util.*;

class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), m = p.length();

        if (n < m)
            return new ArrayList<>();

        List<Integer> res = new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < m; i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }

        if (Arrays.equals(sCount, pCount))
            res.add(0);

        for (int i = 0; i < n - m; i++) {
            sCount[s.charAt(i) - 'a']--;
            sCount[s.charAt(i + m) - 'a']++;

            if (Arrays.equals(sCount, pCount))
                res.add(i + 1);
        }

        return res;
    }
}