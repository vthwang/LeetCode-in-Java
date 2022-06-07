import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonOverlappingIntervalsTest {
    NonOverlappingIntervals NonOverlappingIntervals = new NonOverlappingIntervals();

    @Test
    void Example1() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int results = NonOverlappingIntervals.eraseOverlapIntervals(intervals);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] intervals = {{1, 2}, {1, 2}, {1, 2}};
        int results = NonOverlappingIntervals.eraseOverlapIntervals(intervals);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[][] intervals = {{1, 2}, {2, 3}};
        int results = NonOverlappingIntervals.eraseOverlapIntervals(intervals);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
