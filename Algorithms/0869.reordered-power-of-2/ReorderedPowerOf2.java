import java.util.Arrays;

class ReorderedPowerOf2 {
    private int[] count(int n) {
        int[] res = new int[10];
        while (n > 0) {
            res[n % 10]++;
            n /= 10;
        }
        return res;
    }

    public boolean reorderedPowerOf2(int n) {
        int[] arrays = count(n);
        for (int i = 0; i < 31; i++) {
            if (Arrays.equals(arrays, count(1 << i))) {
                return true;
            }
        }
        return false;
    }
}