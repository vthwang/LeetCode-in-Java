class HammingDistance {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int cnt = 0;
        while (z != 0) {
            if ((z & 1) == 1) cnt++;
            z = z >> 1;
        }
        return cnt;
    }
}