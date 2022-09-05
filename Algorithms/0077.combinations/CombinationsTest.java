import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationsTest {
    Combinations Combinations = new Combinations();

    @Test
    void Example1() {
        int n = 4, k = 2;
        List<List<Integer>> results = Combinations.combine(n ,k);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(1, 2));
        expectedResults.add(Arrays.asList(1, 3));
        expectedResults.add(Arrays.asList(1, 4));
        expectedResults.add(Arrays.asList(2, 3));
        expectedResults.add(Arrays.asList(2, 4));
        expectedResults.add(Arrays.asList(3, 4));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 1, k = 1;
        List<List<Integer>> results = Combinations.combine(n ,k);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(List.of(1));

        Assertions.assertEquals(expectedResults, results);
    }
}
