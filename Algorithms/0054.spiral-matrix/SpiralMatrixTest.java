import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SpiralMatrixTest {
    SpiralMatrix SpiralMatrix = new SpiralMatrix();

    @Test
    void Example1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> results = SpiralMatrix.spiralOrder(matrix);
        List<Integer> expectedResults = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> results = SpiralMatrix.spiralOrder(matrix);
        List<Integer> expectedResults = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);

        Assertions.assertEquals(expectedResults, results);
    }
}
