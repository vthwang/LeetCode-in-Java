import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeIntervalsTest {
    MergeIntervals MergeIntervals = new MergeIntervals();

    @Test
    void Example1() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] results = MergeIntervals.merge(intervals);
        int[][] expectedResults = {{1, 6}, {8, 10}, {15, 18}};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] results = MergeIntervals.merge(intervals);
        int[][] expectedResults = {{1, 5}};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[][] intervals = {{1, 3}};
        int[][] results = MergeIntervals.merge(intervals);
        int[][] expectedResults = {{1, 3}};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        int[][] intervals = {{1, 4}, {0, 4}};
        int[][] results = MergeIntervals.merge(intervals);
        int[][] expectedResults = {{0, 4}};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example5() {
        int[][] intervals = {{1, 4}, {2, 3}};
        int[][] results = MergeIntervals.merge(intervals);
        int[][] expectedResults = {{1, 4}};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
