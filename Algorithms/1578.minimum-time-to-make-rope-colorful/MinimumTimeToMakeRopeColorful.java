class MinimumTimeToMakeRopeColorful {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int l = 0, r = 0;
        while (l < neededTime.length) {
            int currTotal = 0, currMax = 0;
            while (r < neededTime.length && colors.charAt(l) == colors.charAt(r)) {
                currTotal += neededTime[r];
                currMax = Math.max(currMax, neededTime[r]);
                r++;
            }
            totalTime += currTotal - currMax;
            l = r;
        }
        return totalTime;
    }
}