import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumSizeSubarraySumTest {
    MinimumSizeSubarraySum MinimumSizeSubarraySum = new MinimumSizeSubarraySum();

    @Test
    void Example1() {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int results = MinimumSizeSubarraySum.minSubArrayLen(target, nums);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int target = 4;
        int[] nums = {1, 4, 4};
        int results = MinimumSizeSubarraySum.minSubArrayLen(target, nums);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int target = 11;
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int results = MinimumSizeSubarraySum.minSubArrayLen(target, nums);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        int target = 11;
        int[] nums = {1, 2, 3, 4, 5};
        int results = MinimumSizeSubarraySum.minSubArrayLen(target, nums);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }
}
