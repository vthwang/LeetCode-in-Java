class ImageOverlap {
    private int shiftAndCount(int xShift, int yShift, int[][] matrix, int[][] reference) {
        int leftShiftCount = 0, rightShiftCount = 0;
        int rRow = 0;
        for (int mRow = yShift; mRow < matrix.length; mRow++) {
            int rCol = 0;
            for (int mCol = xShift; mCol < matrix.length; mCol++) {
                if (matrix[mRow][mCol] == 1 && matrix[mRow][mCol] == reference[rRow][rCol])
                    leftShiftCount += 1;
                if (matrix[mRow][rCol] == 1 && matrix[mRow][rCol] == reference[rRow][mCol])
                    rightShiftCount += 1;
                rCol += 1;
            }
            rRow += 1;
        }
        return Math.max(leftShiftCount, rightShiftCount);
    }

    public int largestOverlap(int[][] img1, int[][] img2) {
        int maxOverlaps = 0;
        for (int yShift = 0; yShift < img1.length; yShift++) {
            for (int xShift = 0; xShift < img1.length; xShift++) {
                maxOverlaps = Math.max(maxOverlaps, shiftAndCount(xShift, yShift, img1, img2));
                maxOverlaps = Math.max(maxOverlaps, shiftAndCount(xShift, yShift, img2, img1));
            }
        }
        return maxOverlaps;
    }
}