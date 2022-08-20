import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZeroOneMatrixTest {
    ZeroOneMatrix ZeroOneMatrix = new ZeroOneMatrix();

    @Test
    void Example1() {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] results = ZeroOneMatrix.updateMatrix(mat);
        int[][] expectedResults = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        
        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] results = ZeroOneMatrix.updateMatrix(mat);
        int[][] expectedResults = {{0, 0, 0}, {0, 1, 0}, {1, 2, 1}};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
