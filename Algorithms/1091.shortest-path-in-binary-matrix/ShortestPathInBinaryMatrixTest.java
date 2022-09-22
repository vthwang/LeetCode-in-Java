import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestPathInBinaryMatrixTest {
    ShortestPathInBinaryMatrix ShortestPathInBinaryMatrix = new ShortestPathInBinaryMatrix();

    @Test
    void Example1() {
        int[][] grid = {{0, 1}, {1, 0}};
        int results = ShortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        int results = ShortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[][] grid = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        int results = ShortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid);
        int expectedResults = -1;

        Assertions.assertEquals(expectedResults, results);
    }
}
