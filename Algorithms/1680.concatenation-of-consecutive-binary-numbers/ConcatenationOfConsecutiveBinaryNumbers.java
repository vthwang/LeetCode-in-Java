class ConcatenationOfConsecutiveBinaryNumbers {
    private final int modulo = (int) Math.pow(10, 9) + 7;

    public int concatenatedBinary(int n) {
        long res = 0;
        for (int i = 0; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                temp /= 2;
                res *= 2;
            }
            res = (res + i) % modulo;
        }
        return (int) res;
    }
}