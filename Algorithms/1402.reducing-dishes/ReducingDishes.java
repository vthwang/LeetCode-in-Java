import java.util.Arrays;

class ReducingDishes {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int preSum = 0, res = 0;
        for (int i = satisfaction.length - 1; i >= 0; i--) {
            if (preSum + satisfaction[i] > 0) {
                preSum += satisfaction[i];
                res += preSum;
            } else {
                break;
            }
        }
        return res;
    }
}