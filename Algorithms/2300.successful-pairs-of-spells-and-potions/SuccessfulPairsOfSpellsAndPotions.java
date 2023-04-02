import java.util.Arrays;

class SuccessfulPairsOfSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] res = new int[n];
        Arrays.sort(potions);
        for (int i = 0; i < n; i++) {
            int x = spells[i];
            int l = 0, r = m;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if ((long) x * potions[mid] >= success) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            if (l < m) {
                res[i] = m - l;
            }
        }
        return res;
    }
}