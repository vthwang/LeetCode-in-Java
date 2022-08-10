import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindPivotIndexTest {
    FindPivotIndex FindPivotIndex = new FindPivotIndex();

    @Test
    void Example1() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int results = FindPivotIndex.pivotIndex(nums);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 2, 3};
        int results = FindPivotIndex.pivotIndex(nums);
        int expectedResults = -1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {2, 1, -1};
        int results = FindPivotIndex.pivotIndex(nums);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
