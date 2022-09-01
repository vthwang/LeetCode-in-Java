import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInRotatedSortedArrayTest {
    SearchInRotatedSortedArray SearchInRotatedSortedArray = new SearchInRotatedSortedArray();

    @Test
    void Example1() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int results = SearchInRotatedSortedArray.search(nums, target);
        int expectedResult = 4;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int results = SearchInRotatedSortedArray.search(nums, target);
        int expectedResult = -1;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example3() {
        int[] nums = {1};
        int target = 0;
        int results = SearchInRotatedSortedArray.search(nums, target);
        int expectedResult = -1;

        Assertions.assertEquals(expectedResult, results);
    }
}
