import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxChunksToMakeSortedTest {
    MaxChunksToMakeSorted MaxChunksToMakeSorted = new MaxChunksToMakeSorted();

    @Test
    void Example1() {
        int[] nums = {4, 3, 2, 1, 0};
        int results = MaxChunksToMakeSorted.maxChunksToSorted(nums);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 0, 2, 3, 4};
        int results = MaxChunksToMakeSorted.maxChunksToSorted(nums);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {1, 2, 0, 3};
        int results = MaxChunksToMakeSorted.maxChunksToSorted(nums);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
