class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        int m = 0;
        char[] chars = n.toCharArray();
        for (char c : chars) {
            if (c - '0' > m) {
                m = c - '0';
            }
        }
        return m;
    }
}