import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    BinarySearch BinarySearch = new BinarySearch();

    @Test
    void Example1() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int results = BinarySearch.search(nums, target);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int results = BinarySearch.search(nums, target);
        int expectedResults = -1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {5};
        int target = 5;
        int results = BinarySearch.search(nums, target);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
