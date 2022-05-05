import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSumTest {
    FourSum fourSum = new FourSum();

    @Test
    void Example1() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> expectedResults = new LinkedList<>();
        expectedResults.add(Arrays.asList(-2, -1, 1, 2));
        expectedResults.add(Arrays.asList(-2, 0, 0, 2));
        expectedResults.add(Arrays.asList(-1, 0, 0, 1));

        List<List<Integer>> results;
        results = fourSum.fourSum(nums, target);

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {2, 2, 2, 2, 2};
        int target = 8;

        List<List<Integer>> expectedResults = new LinkedList<>();
        expectedResults.add(Arrays.asList(2, 2, 2, 2));

        List<List<Integer>> results;
        results = fourSum.fourSum(nums, target);

        Assertions.assertEquals(expectedResults, results);
    }
}
