import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OutOfBoundaryPathsTest {
    OutOfBoundaryPaths OutOfBoundaryPaths = new OutOfBoundaryPaths();

    @Test
    void Example1() {
        int m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0;

        int results = OutOfBoundaryPaths.findPaths(m, n, maxMove, startRow, startColumn);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1;

        int results = OutOfBoundaryPaths.findPaths(m, n, maxMove, startRow, startColumn);
        int expectedResults = 12;

        Assertions.assertEquals(expectedResults, results);
    }
}
