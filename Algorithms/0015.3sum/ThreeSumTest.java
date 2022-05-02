import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSumTest {
    ThreeSum threeSum = new ThreeSum();

    @Test
    void Example1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> expectedResults = new LinkedList<>();
        expectedResults.add(Arrays.asList(-1, -1, 2));
        expectedResults.add(Arrays.asList(-1, 0, 1));

        List<List<Integer>> results;
        results = threeSum.threeSum(nums);

        Assertions.assertEquals(results, expectedResults);
    }

    @Test
    void Example2() {
        int[] nums = {};

        List<List<Integer>> expectedResults = new LinkedList<>();

        List<List<Integer>> results;
        results = threeSum.threeSum(nums);

        Assertions.assertEquals(results, expectedResults);
    }

    @Test
    void Example3() {
        int[] nums = {0};

        List<List<Integer>> expectedResults = new LinkedList<>();

        List<List<Integer>> results;
        results = threeSum.threeSum(nums);

        Assertions.assertEquals(results, expectedResults);
    }
}
