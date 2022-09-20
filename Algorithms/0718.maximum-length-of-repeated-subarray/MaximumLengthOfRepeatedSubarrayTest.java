import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumLengthOfRepeatedSubarrayTest {
    MaximumLengthOfRepeatedSubarray MaximumLengthOfRepeatedSubarray = new MaximumLengthOfRepeatedSubarray();

    @Test
    void Example1() {
        int[] nums1 = {1, 2, 3, 2, 1}, nums2 = {3, 2, 1, 4, 7};
        int results = MaximumLengthOfRepeatedSubarray.findLength(nums1, nums2);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums1 = {0, 0, 0, 0, 0}, nums2 = {0, 0, 0, 0, 0};
        int results = MaximumLengthOfRepeatedSubarray.findLength(nums1, nums2);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);
    }
}
