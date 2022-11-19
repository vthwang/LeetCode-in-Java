import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ErectTheFenceTest {
    ErectTheFence ErectTheFence = new ErectTheFence();

    @Test
    void Example1() {
        int[][] points = {{1, 1}, {2, 2}, {2, 0}, {2, 4}, {3, 3}, {4, 2}};
        int[][] results = ErectTheFence.outerTrees(points);
        int[][] expectedResults = {{1, 1}, {2, 0}, {4, 2}, {3, 3}, {2, 4}};

        List<List<Integer>> resultsList = new ArrayList<>();
        for (int[] result : results) {
            List<Integer> rList = new ArrayList<>();
            for (int r : result) {
                rList.add(r);
            }
            resultsList.add(rList);
        }
        List<List<Integer>> expectedResultsList = new ArrayList<>();
        for (int[] expectedResult : expectedResults) {
            List<Integer> rList = new ArrayList<>();
            for (int er : expectedResult) {
                rList.add(er);
            }
            expectedResultsList.add(rList);
        }

        Assertions.assertEquals(expectedResults.length, results.length);
        Assertions.assertTrue(resultsList.containsAll(expectedResultsList));
    }

    @Test
    void Example2() {
        int[][] points = {{1, 2}, {2, 2}, {4, 2}};
        int[][] results = ErectTheFence.outerTrees(points);
        int[][] expectedResults = {{2, 2}, {4, 2}, {1, 2}};

        List<List<Integer>> resultsList = new ArrayList<>();
        for (int[] result : results) {
            List<Integer> rList = new ArrayList<>();
            for (int r : result) {
                rList.add(r);
            }
            resultsList.add(rList);
        }
        List<List<Integer>> expectedResultsList = new ArrayList<>();
        for (int[] expectedResult : expectedResults) {
            List<Integer> rList = new ArrayList<>();
            for (int er : expectedResult) {
                rList.add(er);
            }
            expectedResultsList.add(rList);
        }

        Assertions.assertEquals(expectedResults.length, results.length);
        Assertions.assertTrue(resultsList.containsAll(expectedResultsList));
    }
}
