class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        int[] isTrusted = new int[n + 1];
        int[] trustOthers = new int[n + 1];
        for (int[] edge : trust) {
            trustOthers[edge[0]]++;
            isTrusted[edge[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (isTrusted[i] == n - 1 && trustOthers[i] == 0)
                return i;
        }
        return -1;
    }
}