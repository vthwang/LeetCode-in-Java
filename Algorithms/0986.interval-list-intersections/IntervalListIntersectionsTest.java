import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntervalListIntersectionsTest {
    IntervalListIntersections IntervalListIntersections = new IntervalListIntersections();

    @Test
    void Example1() {
        int[][] firstList = {{0, 2}, {5, 10}, {13, 23}, {24, 25}},  secondList = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] results = IntervalListIntersections.intervalIntersection(firstList, secondList);
        int[][] expectedResults = {{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] firstList = {{1, 3}, {5, 9}},  secondList = {};
        int[][] results = IntervalListIntersections.intervalIntersection(firstList, secondList);
        int[][] expectedResults = {};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
