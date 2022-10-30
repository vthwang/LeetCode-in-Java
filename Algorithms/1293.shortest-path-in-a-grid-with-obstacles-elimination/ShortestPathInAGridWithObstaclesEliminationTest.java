import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestPathInAGridWithObstaclesEliminationTest {
    ShortestPathInAGridWithObstaclesElimination ShortestPathInAGridWithObstaclesElimination = new ShortestPathInAGridWithObstaclesElimination();

    @Test
    void Example1() {
        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {0, 0, 0}, {0, 1, 1}, {0, 0, 0}};
        int k = 1;
        int results = ShortestPathInAGridWithObstaclesElimination.shortestPath(grid, k);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] grid = {{0, 1, 1}, {1, 1, 1}, {1, 0, 0}};
        int k = 1;
        int results = ShortestPathInAGridWithObstaclesElimination.shortestPath(grid, k);
        int expectedResults = -1;

        Assertions.assertEquals(expectedResults, results);
    }
}
