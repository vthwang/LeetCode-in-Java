import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsIiTest {
    PermutationsIi PermutationsIi = new PermutationsIi();

    @Test
    void Example1() {
        int[] nums = {1, 1, 2};
        List<List<Integer>> results = PermutationsIi.permuteUnique(nums);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(1, 1, 2));
        expectedResults.add(Arrays.asList(1, 2, 1));
        expectedResults.add(Arrays.asList(2, 1, 1));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> results = PermutationsIi.permuteUnique(nums);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(1, 2, 3));
        expectedResults.add(Arrays.asList(1, 3, 2));
        expectedResults.add(Arrays.asList(2, 1, 3));
        expectedResults.add(Arrays.asList(2, 3, 1));
        expectedResults.add(Arrays.asList(3, 1, 2));
        expectedResults.add(Arrays.asList(3, 2, 1));

        Assertions.assertEquals(expectedResults, results);
    }
}
