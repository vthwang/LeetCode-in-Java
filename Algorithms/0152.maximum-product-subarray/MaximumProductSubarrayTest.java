import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumProductSubarrayTest {
    MaximumProductSubarray MaximumProductSubarray = new MaximumProductSubarray();

    @Test
    void Example1() {
        int[] nums = {2, 3, -2, 4};
        int results = MaximumProductSubarray.maxProduct(nums);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {-2, 0, -1};
        int results = MaximumProductSubarray.maxProduct(nums);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {3, 2, 4, -1};
        int results = MaximumProductSubarray.maxProduct(nums);
        int expectedResults = 24;

        Assertions.assertEquals(expectedResults, results);
    }
}
