import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsTest {
    Subsets Subsets = new Subsets();
    Subsets2 Subsets2 = new Subsets2();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> results = Subsets.subsets(nums);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(new ArrayList<>());
        expectedResults.add(List.of(1));
        expectedResults.add(List.of(2));
        expectedResults.add(Arrays.asList(1, 2));
        expectedResults.add(List.of(3));
        expectedResults.add(Arrays.asList(1, 3));
        expectedResults.add(Arrays.asList(2, 3));
        expectedResults.add(Arrays.asList(1, 2, 3));

        Assertions.assertEquals(expectedResults, results);

        results = Subsets2.subsets(nums);
        List<List<Integer>> expectedResults2 = new ArrayList<>();
        expectedResults2.add(new ArrayList<>());
        expectedResults2.add(List.of(1));
        expectedResults2.add(List.of(2));
        expectedResults2.add(List.of(3));
        expectedResults2.add(Arrays.asList(1, 2));
        expectedResults2.add(Arrays.asList(1, 3));
        expectedResults2.add(Arrays.asList(2, 3));
        expectedResults2.add(Arrays.asList(1, 2, 3));

        Assertions.assertEquals(expectedResults2, results);
    }

    @Test
    void Example2() {
        int[] nums = {0};
        List<List<Integer>> results = Subsets.subsets(nums);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(new ArrayList<>());
        expectedResults.add(List.of(0));

        Assertions.assertEquals(expectedResults, results);

        results = Subsets2.subsets(nums);
        Assertions.assertEquals(expectedResults, results);
    }
}
