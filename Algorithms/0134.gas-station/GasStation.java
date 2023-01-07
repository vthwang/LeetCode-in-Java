class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length, i = 0;
        while (i < n) {
            int sumOfGas = 0, sumOfCost = 0, cnt = 0;
            while (cnt < n) {
                int j = (i + cnt) % n;
                sumOfGas += gas[j];
                sumOfCost += cost[j];
                if (sumOfCost > sumOfGas)
                    break;
                cnt++;
            }
            if (cnt == n)
                return i;
            else
                i = i + cnt + 1;
        }
        return -1;
    }
}