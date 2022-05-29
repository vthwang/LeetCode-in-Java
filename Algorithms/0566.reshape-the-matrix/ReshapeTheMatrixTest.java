import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReshapeTheMatrixTest {
    ReshapeTheMatrix ReshapeTheMatrix = new ReshapeTheMatrix();

    @Test
    void Example1() {
        int[][] mat = {{1, 2}, {3, 4}};

        int r = 1, c = 4;
        int[][] results = ReshapeTheMatrix.matrixReshape(mat, r, c);
        int[][] expectedResults = {{1, 2, 3, 4}};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] mat = {{1, 2}, {3, 4}};

        int r = 2, c = 4;
        int[][] results = ReshapeTheMatrix.matrixReshape(mat, r, c);
        int[][] expectedResults = {{1, 2}, {3, 4}};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
