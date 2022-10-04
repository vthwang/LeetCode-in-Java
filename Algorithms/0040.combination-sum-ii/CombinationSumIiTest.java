import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIiTest {
    CombinationSumIi CombinationSumIi = new CombinationSumIi();

    @Test
    void Example1() {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> results = CombinationSumIi.combinationSum2(candidates, target);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(1, 1, 6));
        expectedResults.add(Arrays.asList(1, 2, 5));
        expectedResults.add(Arrays.asList(1, 7));
        expectedResults.add(Arrays.asList(2, 6));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] candidates = {2, 5, 2, 1, 2};
        int target = 5;
        List<List<Integer>> results = CombinationSumIi.combinationSum2(candidates, target);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(1, 2, 2));
        expectedResults.add(List.of(5));

        Assertions.assertEquals(expectedResults, results);
    }
}
