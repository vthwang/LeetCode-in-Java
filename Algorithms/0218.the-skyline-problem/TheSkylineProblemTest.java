import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheSkylineProblemTest {
    TheSkylineProblem TheSkylineProblem = new TheSkylineProblem();

    @Test
    void Example1() {
        int[][] buildings = {{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
        List<List<Integer>> results = TheSkylineProblem.getSkyline(buildings);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(2, 10));
        expectedResults.add(Arrays.asList(3, 15));
        expectedResults.add(Arrays.asList(7, 12));
        expectedResults.add(Arrays.asList(12, 0));
        expectedResults.add(Arrays.asList(15, 10));
        expectedResults.add(Arrays.asList(20, 8));
        expectedResults.add(Arrays.asList(24, 0));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] buildings = {{0,2,3},{2,5,3}};
        List<List<Integer>> results = TheSkylineProblem.getSkyline(buildings);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(0, 3));
        expectedResults.add(Arrays.asList(5, 0));

        Assertions.assertEquals(expectedResults, results);
    }
}
