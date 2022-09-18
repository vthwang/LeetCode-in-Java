import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubarrayProductLessThanKTest {
    SubarrayProductLessThanK SubarrayProductLessThanK = new SubarrayProductLessThanK();

    @Test
    void Example1() {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int results = SubarrayProductLessThanK.numSubarrayProductLessThanK(nums, k);
        int expectedResults = 8;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 2, 3};
        int k = 0;
        int results = SubarrayProductLessThanK.numSubarrayProductLessThanK(nums, k);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
