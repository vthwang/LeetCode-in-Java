import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {
    SearchInsertPosition SearchInsertPosition = new SearchInsertPosition();

    @Test
    void Example1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int results = SearchInsertPosition.searchInsert(nums, target);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int results = SearchInsertPosition.searchInsert(nums, target);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int results = SearchInsertPosition.searchInsert(nums, target);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int results = SearchInsertPosition.searchInsert(nums, target);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
