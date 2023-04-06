import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfClosedIslandsTest {
    NumberOfClosedIslands numberOfClosedIslands = new NumberOfClosedIslands();

    @Test
    void Example1() {
        int[][] grid = {{1, 1, 1, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1, 1, 0}, {1, 0, 1, 0, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1, 0, 1}, {1, 1, 1, 1, 1, 1, 1, 0}};

        Assertions.assertEquals(2, numberOfClosedIslands.closedIsland(grid));
    }

    @Test
    void Example2() {
        int[][] grid = {{0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 1, 1, 1, 0}};

        Assertions.assertEquals(1, numberOfClosedIslands.closedIsland(grid));
    }

    @Test
    void Example3() {
        int[][] grid = {{1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 0, 1}, {1, 0, 1, 1, 1, 0, 1}, {1, 0, 1, 0, 1, 0, 1}, {1, 0, 1, 1, 1, 0, 1}, {1, 0, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1, 1}};

        Assertions.assertEquals(2, numberOfClosedIslands.closedIsland(grid));
    }
}
