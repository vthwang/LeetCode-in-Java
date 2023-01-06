class MaximumIceCreamBars2 {
    public int maxIceCream(int[] costs, int coins) {
        int[] freq = new int[100001];
        for (int i = 0; i < costs.length; i++)
            freq[costs[i]]++;
        int ans = 0;
        for (int i = 1; i <= 100000; i++) {
            if (coins >= i) {
                int currCount = Math.min(freq[i], coins / i);
                ans += currCount;
                coins -= currCount * i;
            } else
                break;
        }
        return ans;
    }
}