class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int testBuckets = minutesToTest / minutesToDie;
        int pigs = 0;
        while (Math.pow(testBuckets + 1, pigs) < buckets) {
            pigs++;
        }
        return pigs;
    }
}