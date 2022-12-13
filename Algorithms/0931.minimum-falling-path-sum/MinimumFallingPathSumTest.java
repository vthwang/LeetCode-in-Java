import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumFallingPathSumTest {
    MinimumFallingPathSum minimumFallingPathSum = new MinimumFallingPathSum();

    @Test
    void Example1() {
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};

        Assertions.assertEquals(13, minimumFallingPathSum.minFallingPathSum(matrix));
    }

    @Test
    void Example2() {
        int[][] matrix = {{-19, 57}, {-40, -5}};

        Assertions.assertEquals(-59, minimumFallingPathSum.minFallingPathSum(matrix));
    }
}
