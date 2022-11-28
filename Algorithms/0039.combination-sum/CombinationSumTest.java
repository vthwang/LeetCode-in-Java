import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTest {
    CombinationSum CombinationSum = new CombinationSum();

    @Test
    void Example1() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> results = CombinationSum.combinationSum(candidates, target);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(2, 2, 3));
        expectedResults.add(List.of(7));

        results.sort(new ListComparator<>());
        expectedResults.sort(new ListComparator<>());

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> results = CombinationSum.combinationSum(candidates, target);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(2, 2, 2, 2));
        expectedResults.add(Arrays.asList(2, 3, 3));
        expectedResults.add(Arrays.asList(3, 5));

        results.sort(new ListComparator<>());
        expectedResults.sort(new ListComparator<>());

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] candidates = {2};
        int target = 1;
        List<List<Integer>> results = CombinationSum.combinationSum(candidates, target);
        List<List<Integer>> expectedResults = new ArrayList<>();

        results.sort(new ListComparator<>());

        Assertions.assertEquals(expectedResults, results);
    }
}
