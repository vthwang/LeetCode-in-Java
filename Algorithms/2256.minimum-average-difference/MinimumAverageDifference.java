class MinimumAverageDifference {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long[] prefixSum = new long[n + 1];
        long[] suffixSum = new long[n + 1];
        int ans = -1;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
            prefixSum[i + 1] = prefixSum[i] + nums[i];

        for (int i = n - 1; i >= 0; i--)
            suffixSum[i] = suffixSum[i + 1] + nums[i];

        for (int i = 0; i < n; i++) {
            long leftAverage = prefixSum[i + 1];
            leftAverage /= (i + 1);

            long rightAverage = suffixSum[i + 1];
            if (i != n -1)
                rightAverage /= (n - 1 - i);

            int currDifference = (int) Math.abs(leftAverage - rightAverage);
            if (currDifference < minDiff) {
                minDiff = currDifference;
                ans = i;
            }
        }
        return ans;
    }
}