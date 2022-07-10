import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinCostClimbingStairsTest {
    MinCostClimbingStairs MinCostClimbingStairs = new MinCostClimbingStairs();

    @Test
    void Example1() {
        int[] cost = {10, 15, 20};
        int results = MinCostClimbingStairs.minCostClimbingStairs(cost);
        int expectedResults = 15;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int results = MinCostClimbingStairs.minCostClimbingStairs(cost);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }
}
