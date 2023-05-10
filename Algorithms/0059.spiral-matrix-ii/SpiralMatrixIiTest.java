import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpiralMatrixIiTest {
    SpiralMatrixIi spiralMatrixIi = new SpiralMatrixIi();

    @Test
    void Example1() {
        int n = 3;

        Assertions.assertArrayEquals(new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}}, spiralMatrixIi.generateMatrix(n));
    }

    @Test
    void Example2() {
        int n = 1;

        Assertions.assertArrayEquals(new int[][]{{1}}, spiralMatrixIi.generateMatrix(n));
    }
}
