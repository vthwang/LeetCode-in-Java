import java.util.ArrayList;
import java.util.List;

class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ansList = new ArrayList<>();
        int i = 0;

        // add all the intervals before newInterval starts
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            ansList.add(intervals[i]);
            i++;
        }

        // merge intervals with the insert interval
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        ansList.add(newInterval);

        // add the rest of intervals
        while (i < intervals.length) {
            ansList.add(intervals[i]);
            i++;
        }

        int[][] ans = new int[ansList.size()][2];
        for (int j = 0; j < ansList.size(); j++)
            ans[j] = ansList.get(j);

        return ans;
    }
}