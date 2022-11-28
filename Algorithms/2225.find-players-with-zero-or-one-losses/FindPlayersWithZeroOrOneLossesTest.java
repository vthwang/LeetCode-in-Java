import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPlayersWithZeroOrOneLossesTest {
    FindPlayersWithZeroOrOneLosses findPlayersWithZeroOrOneLosses = new FindPlayersWithZeroOrOneLosses();

    @Test
    void Example1() {
        int[][] matches = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        List<List<Integer>> results = findPlayersWithZeroOrOneLosses.findWinners(matches);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(1, 2, 10));
        expectedResults.add(Arrays.asList(4, 5, 7, 8));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] matches = {{2, 3}, {1, 3}, {5, 4}, {6, 4}};
        List<List<Integer>> results = findPlayersWithZeroOrOneLosses.findWinners(matches);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(1, 2, 5, 6));
        expectedResults.add(new ArrayList<>());

        Assertions.assertEquals(expectedResults, results);
    }
}
