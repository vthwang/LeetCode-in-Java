import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RottingOrangesTest {
    RottingOranges RottingOranges = new RottingOranges();

    @Test
    void Example1() {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int results = RottingOranges.orangesRotting(grid);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int results = RottingOranges.orangesRotting(grid);
        int expectedResults = -1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[][] grid = {{0, 2}};
        int results = RottingOranges.orangesRotting(grid);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
