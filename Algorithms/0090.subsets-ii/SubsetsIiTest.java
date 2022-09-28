import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsIiTest {
    SubsetsIi SubsetsIi = new SubsetsIi();

    @Test
    void Example1() {
        int[] nums = {1, 2, 2};
        List<List<Integer>> results = SubsetsIi.subsetsWithDup(nums);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(new ArrayList<>());
        expectedResults.add(List.of(1));
        expectedResults.add(List.of(2));
        expectedResults.add(Arrays.asList(1, 2));
        expectedResults.add(Arrays.asList(2, 2));
        expectedResults.add(Arrays.asList(1, 2, 2));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {0};
        List<List<Integer>> results = SubsetsIi.subsetsWithDup(nums);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(new ArrayList<>());
        expectedResults.add(List.of(0));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {4, 4, 4, 1, 4};
        List<List<Integer>> results = SubsetsIi.subsetsWithDup(nums);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(new ArrayList<>());
        expectedResults.add(List.of(1));
        expectedResults.add(List.of(4));
        expectedResults.add(Arrays.asList(1, 4));
        expectedResults.add(Arrays.asList(4, 4));
        expectedResults.add(Arrays.asList(1, 4, 4));
        expectedResults.add(Arrays.asList(4, 4, 4));
        expectedResults.add(Arrays.asList(1, 4, 4, 4));
        expectedResults.add(Arrays.asList(4, 4, 4, 4));
        expectedResults.add(Arrays.asList(1, 4, 4, 4, 4));

        Assertions.assertEquals(expectedResults, results);
    }
}
