import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumNumberOfArrowsToBurstBalloonsTest {
    MinimumNumberOfArrowsToBurstBalloons MinimumNumberOfArrowsToBurstBalloons = new MinimumNumberOfArrowsToBurstBalloons();

    @Test
    void Example1() {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int results = MinimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int results = MinimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int results = MinimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
