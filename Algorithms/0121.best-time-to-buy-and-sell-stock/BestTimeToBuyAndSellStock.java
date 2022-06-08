class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;
        int soFarMin = prices[0], max = 0;
        for (int i = 1; i < n; i++) {
            if (soFarMin > prices[i]) soFarMin = prices[i];
            else max = Math.max(max, prices[i] - soFarMin);
        }
        return max;
    }
}