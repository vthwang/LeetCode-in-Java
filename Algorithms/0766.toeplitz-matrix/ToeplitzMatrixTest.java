import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToeplitzMatrixTest {
    ToeplitzMatrix ToeplitzMatrix = new ToeplitzMatrix();

    @Test
    void Example1() {
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        boolean results = ToeplitzMatrix.isToeplitzMatrix(matrix);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] matrix = {{1,2},{2,2}};
        boolean results = ToeplitzMatrix.isToeplitzMatrix(matrix);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
