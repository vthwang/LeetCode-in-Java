import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfEvenNumbersAfterQueriesTest {
    SumOfEvenNumbersAfterQueries SumOfEvenNumbersAfterQueries = new SumOfEvenNumbersAfterQueries();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] results = SumOfEvenNumbersAfterQueries.sumEvenAfterQueries(nums, queries);
        int[] expectedResults = {8, 6, 2, 4};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1};
        int[][] queries = {{4, 0}};
        int[] results = SumOfEvenNumbersAfterQueries.sumEvenAfterQueries(nums, queries);
        int[] expectedResults = {0};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
