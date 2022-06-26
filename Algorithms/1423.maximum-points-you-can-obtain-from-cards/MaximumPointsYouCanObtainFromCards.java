class MaximumPointsYouCanObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {
        int l = 0, r = cardPoints.length - k;
        int sum = 0;
        for (int i = r; i < cardPoints.length; i++) {
            sum += cardPoints[i];
        }
        if (cardPoints.length == k) {
            return sum;
        }
        int max = sum;
        while (r < cardPoints.length) {
            sum += (cardPoints[l] - cardPoints[r]);
            max = Math.max(max, sum);
            l++;
            r++;
        }
        return max;
    }
}