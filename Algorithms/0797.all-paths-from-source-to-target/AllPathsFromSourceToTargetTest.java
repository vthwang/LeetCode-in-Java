import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPathsFromSourceToTargetTest {
    AllPathsFromSourceToTarget AllPathsFromSourceToTarget = new AllPathsFromSourceToTarget();

    @Test
    void Example1() {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        List<List<Integer>> results = AllPathsFromSourceToTarget.allPathsSourceTarget(graph);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(0, 1, 3));
        expectedResults.add(Arrays.asList(0, 2, 3));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] graph = {{4,3,1},{3,2,4},{3},{4},{}};
        List<List<Integer>> results = AllPathsFromSourceToTarget.allPathsSourceTarget(graph);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(0, 4));
        expectedResults.add(Arrays.asList(0, 3, 4));
        expectedResults.add(Arrays.asList(0, 1, 4));
        expectedResults.add(Arrays.asList(0, 1, 3, 4));
        expectedResults.add(Arrays.asList(0, 1, 2, 3, 4));

        Assertions.assertEquals(expectedResults, results);
    }
}
