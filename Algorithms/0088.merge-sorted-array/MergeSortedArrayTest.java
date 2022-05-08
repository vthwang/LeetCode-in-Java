import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {
    MergeSortedArray MergeSortedArray = new MergeSortedArray();

    @Test
    void Example1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int [] expectedResults = {1, 2, 2, 3, 5, 6};

        MergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expectedResults, nums1);
    }

    @Test
    void Example2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int [] expectedResults = {1};

        MergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expectedResults, nums1);
    }

    @Test
    void Example3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int [] expectedResults = {1};

        MergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expectedResults, nums1);
    }
}
