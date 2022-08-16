import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FloodFillTest {
    FloodFill FloodFill = new FloodFill();

    @Test
    void Example1() {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, color = 2;
        int[][] results = FloodFill.floodFill(image, sr, sc, color);
        int[][] expectedResults = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        int sr = 0, sc = 0, color = 0;
        int[][] results = FloodFill.floodFill(image, sr, sc, color);
        int[][] expectedResults = {{0, 0, 0}, {0, 0, 0}};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
