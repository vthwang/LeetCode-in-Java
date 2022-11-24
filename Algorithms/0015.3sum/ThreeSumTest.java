import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTest {
    ThreeSum threeSum = new ThreeSum();

    @Test
    void Example1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> results = threeSum.threeSum(nums);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(-1, -1, 2));
        expectedResults.add(Arrays.asList(-1, 0, 1));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {};
        List<List<Integer>> results = threeSum.threeSum(nums);
        List<List<Integer>> expectedResults = new ArrayList<>();

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {0};
        List<List<Integer>> results = threeSum.threeSum(nums);
        List<List<Integer>> expectedResults = new ArrayList<>();

        Assertions.assertEquals(expectedResults, results);
    }
}
