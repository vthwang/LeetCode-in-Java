import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UncrossedLinesTest {
    UncrossedLines uncrossedLines = new UncrossedLines();

    @Test
    void Example1() {
        int[] nums1 = {1, 4, 2}, nums2 = {1, 2, 4};

        Assertions.assertEquals(2, uncrossedLines.maxUncrossedLines(nums1, nums2));
    }

    @Test
    void Example2() {
        int[] nums1 = {2, 5, 1, 2, 5}, nums2 = {10, 5, 2, 1, 5, 2};

        Assertions.assertEquals(3, uncrossedLines.maxUncrossedLines(nums1, nums2));
    }

    @Test
    void Example3() {
        int[] nums1 = {1, 3, 7, 1, 7, 5}, nums2 = {1, 9, 2, 5, 1};

        Assertions.assertEquals(2, uncrossedLines.maxUncrossedLines(nums1, nums2));
    }
}
