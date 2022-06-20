import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMinimumInRotatedSortedArrayTest {
    FindMinimumInRotatedSortedArray FindMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();

    @Test
    void Example1() {
        int[] nums = {3, 4, 5, 1, 2};
        int results = FindMinimumInRotatedSortedArray.findMin(nums);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int results = FindMinimumInRotatedSortedArray.findMin(nums);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {11, 13, 15, 17};
        int results = FindMinimumInRotatedSortedArray.findMin(nums);
        int expectedResults = 11;

        Assertions.assertEquals(expectedResults, results);
    }
}
