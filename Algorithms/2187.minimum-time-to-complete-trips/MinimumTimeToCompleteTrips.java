import java.util.Arrays;

class MinimumTimeToCompleteTrips {
    public long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        long l = 1, r = (long) totalTrips * time[0];
        while (l < r) {
            long mid = l + (r - l) / 2;
            if (check(mid, time, totalTrips)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean check(long currentTime, int[] time, int totalTrips) {
        long cnt = 0;
        for (int period : time) {
            if (period > currentTime) {
                break;
            }
            cnt += currentTime / period;
        }
        return cnt >= totalTrips;
    }
}