import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxAreaOfIslandTest {
    MaxAreaOfIsland MaxAreaOfIsland = new MaxAreaOfIsland();

    @Test
    void Example1() {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

        int results = MaxAreaOfIsland.maxAreaOfIsland(grid);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] grid = {{0, 0, 0, 0, 0, 0, 0, 0}};

        int results = MaxAreaOfIsland.maxAreaOfIsland(grid);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
