import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertIntervalTest {
    InsertInterval InsertInterval = new InsertInterval();

    @Test
    void Example1() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] results = InsertInterval.insert(intervals, newInterval);
        int[][] expectResults = {{1, 5}, {6, 9}};

        Assertions.assertArrayEquals(expectResults, results);
    }

    @Test
    void Example2() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] results = InsertInterval.insert(intervals, newInterval);
        int[][] expectResults = {{1, 2}, {3, 10}, {12, 16}};

        Assertions.assertArrayEquals(expectResults, results);
    }
}
