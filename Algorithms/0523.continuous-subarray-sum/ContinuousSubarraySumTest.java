import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContinuousSubarraySumTest {
    ContinuousSubarraySum ContinuousSubarraySum = new ContinuousSubarraySum();

    @Test
    void Example1() {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        boolean results = ContinuousSubarraySum.checkSubarraySum(nums, k);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {23, 2, 6, 4, 7};
        int k = 6;
        boolean results = ContinuousSubarraySum.checkSubarraySum(nums, k);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {23, 2, 6, 4, 7};
        int k = 13;
        boolean results = ContinuousSubarraySum.checkSubarraySum(nums, k);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
