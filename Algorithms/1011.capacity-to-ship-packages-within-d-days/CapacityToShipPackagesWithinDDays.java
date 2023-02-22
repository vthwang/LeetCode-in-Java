import java.util.Arrays;

class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        while (left < right) {
            int mid = (left + right) / 2;
            int need = 1, curr = 0;
            for (int weight : weights) {
                if (curr + weight > mid) {
                    need++;
                    curr = 0;
                }
                curr += weight;
            }
            if (need <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}