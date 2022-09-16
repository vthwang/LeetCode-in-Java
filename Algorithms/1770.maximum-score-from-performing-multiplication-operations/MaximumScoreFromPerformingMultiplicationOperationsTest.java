import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumScoreFromPerformingMultiplicationOperationsTest {
    MaximumScoreFromPerformingMultiplicationOperations MaximumScoreFromPerformingMultiplicationOperations = new MaximumScoreFromPerformingMultiplicationOperations();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3}, multipliers = {3, 2, 1};
        int results = MaximumScoreFromPerformingMultiplicationOperations.maximumScore(nums, multipliers);
        int expectedResults = 14;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {-5, -3, -3, -2, 7, 1},  multipliers = {-10, -5, 3, 4, 6};
        int results = MaximumScoreFromPerformingMultiplicationOperations.maximumScore(nums, multipliers);
        int expectedResults = 102;

        Assertions.assertEquals(expectedResults, results);
    }
}
