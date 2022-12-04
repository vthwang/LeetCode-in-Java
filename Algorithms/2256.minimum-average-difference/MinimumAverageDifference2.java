class MinimumAverageDifference2 {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int minDiff = Integer.MAX_VALUE;
        long currPrefixSum = 0;

        long totalSum = 0;
        for (int i = 0; i < n; i++)
            totalSum += nums[i];

        for (int i = 0; i < n; i++) {
            currPrefixSum += nums[i];

            long leftAverage = currPrefixSum;
            leftAverage /= (i + 1);

            long rightAverage = totalSum - currPrefixSum;
            if (i != n - 1)
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