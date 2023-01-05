import java.util.Arrays;
import java.util.Comparator;

class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0)
            return 0;
        Arrays.sort(points, Comparator.comparingInt(p -> p[1]));
        int ans = 1, end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                ans++;
                end = points[i][1];
            }
        }
        return ans;
    }
}