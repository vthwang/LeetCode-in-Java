import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixDiagonalSumTest {
    MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();

    @Test
    void Example1() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Assertions.assertEquals(25, matrixDiagonalSum.diagonalSum(mat));
    }

    @Test
    void Example2() {
        int[][] mat = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};

        Assertions.assertEquals(8, matrixDiagonalSum.diagonalSum(mat));
    }

    @Test
    void Example3() {
        int[][] mat = {{5}};

        Assertions.assertEquals(5, matrixDiagonalSum.diagonalSum(mat));
    }

    @Test
    void Example4() {
        int[][] mat = {{7, 3, 1, 9}, {3, 4, 6, 9}, {6, 9, 6, 6}, {9, 5, 8, 5}};

        Assertions.assertEquals(55, matrixDiagonalSum.diagonalSum(mat));
    }
}
