import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {
    FindFirstAndLastPositionOfElementInSortedArray FindFirstAndLastPositionOfElementInSortedArray = new FindFirstAndLastPositionOfElementInSortedArray();

    @Test
    void Example1() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] results = FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, target);
        int[] expectedResults = {3, 4};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] results = FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, target);
        int[] expectedResults = {-1, -1};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {};
        int target = 0;
        int[] results = FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, target);
        int[] expectedResults = {-1, -1};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
