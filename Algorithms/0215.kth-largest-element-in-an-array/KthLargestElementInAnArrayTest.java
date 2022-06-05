import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestElementInAnArrayTest {
    KthLargestElementInAnArray KthLargestElementInAnArray = new KthLargestElementInAnArray();
    KthLargestElementInAnArray2 KthLargestElementInAnArray2 = new KthLargestElementInAnArray2();
    KthLargestElementInAnArray3 KthLargestElementInAnArray3 = new KthLargestElementInAnArray3();

    @Test
    void Example1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int results = KthLargestElementInAnArray.findKthLargest(nums, k);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);

        results = KthLargestElementInAnArray2.findKthLargest(nums, k);
        Assertions.assertEquals(expectedResults, results);

        results = KthLargestElementInAnArray3.findKthLargest(nums, k);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;

        int results = KthLargestElementInAnArray.findKthLargest(nums, k);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);

        results = KthLargestElementInAnArray2.findKthLargest(nums, k);
        Assertions.assertEquals(expectedResults, results);

        results = KthLargestElementInAnArray3.findKthLargest(nums, k);
        Assertions.assertEquals(expectedResults, results);
    }
}
