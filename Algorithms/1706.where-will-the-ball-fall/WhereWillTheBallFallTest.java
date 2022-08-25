import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhereWillTheBallFallTest {
    WhereWillTheBallFall WhereWillTheBallFall = new WhereWillTheBallFall();

    @Test
    void Example1() {
        int[][] grid = {{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {-1, -1, -1, -1, -1}};
        int[] results = WhereWillTheBallFall.findBall(grid);
        int[] expectedResults = {1, -1, -1, -1, -1};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] grid = {{-1}};
        int[] results = WhereWillTheBallFall.findBall(grid);
        int[] expectedResults = {-1};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[][] grid = {{1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}, {1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}};
        int[] results = WhereWillTheBallFall.findBall(grid);
        int[] expectedResults = {0, 1, 2, 3, 4, -1};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
