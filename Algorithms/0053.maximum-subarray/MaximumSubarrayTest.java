import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSubarrayTest {
    MaximumSubarray MaximumSubarray = new MaximumSubarray();

    @Test
    void Example1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int results = MaximumSubarray.maxSubArray(nums);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1};
        int results = MaximumSubarray.maxSubArray(nums);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {5, 4, -1, 7, 8};
        int results = MaximumSubarray.maxSubArray(nums);
        int expectedResults = 23;

        Assertions.assertEquals(expectedResults, results);
    }
}
