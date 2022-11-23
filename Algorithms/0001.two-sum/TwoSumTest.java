import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    TwoSum twoSum = new TwoSum();
    TwoSum2 twoSum2 = new TwoSum2();

    @Test
    void Example1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResults = {0, 1};

        int[] results;

        results = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(expectedResults, results);

        results = twoSum2.twoSum(nums, target);
        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expectedResults = {1, 2};

        int[] results;

        results = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(expectedResults, results);

        results = twoSum2.twoSum(nums, target);
        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expectedResults = {0, 1};

        int[] results;

        results = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(expectedResults, results);

        results = twoSum2.twoSum(nums, target);
        Assertions.assertArrayEquals(expectedResults, results);
    }
}
