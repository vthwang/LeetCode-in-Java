public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt = 0;
        // deal with sign part
        if (n < 0) {
            cnt++;
            n = n + 1 + Integer.MAX_VALUE;
        }
        while (n != 0) {
            if ((n & 1) == 1) cnt++;
            n = n >> 1;
        }
        return cnt;
    }
}