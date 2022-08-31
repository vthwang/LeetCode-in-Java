import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlowTest {
    PacificAtlanticWaterFlow PacificAtlanticWaterFlow = new PacificAtlanticWaterFlow();

    @Test
    void Example1() {
        int[][] heights = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        List<List<Integer>> results = PacificAtlanticWaterFlow.pacificAtlantic(heights);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(0, 4));
        expectedResults.add(Arrays.asList(1, 3));
        expectedResults.add(Arrays.asList(1, 4));
        expectedResults.add(Arrays.asList(2, 2));
        expectedResults.add(Arrays.asList(3, 0));
        expectedResults.add(Arrays.asList(3, 1));
        expectedResults.add(Arrays.asList(4, 0));

        Assertions.assertEquals(expectedResults,  results);
    }

    @Test
    void Example2() {
        int[][] heights = {{1}};
        List<List<Integer>> results = PacificAtlanticWaterFlow.pacificAtlantic(heights);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(0, 0));

        Assertions.assertEquals(expectedResults,  results);
    }
}
