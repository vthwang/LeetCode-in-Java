class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false;

        int i = 0, j = (int) Math.sqrt(c);
        while (i <= j) {
            long sum = ((long) i * i) + ((long) j * j);
            if (sum == c) {
                return true;
            } else if (sum > c) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}