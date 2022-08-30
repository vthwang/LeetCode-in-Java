import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateImageTest {
    RotateImage RotateImage = new RotateImage();

    @Test
    void Example1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateImage.rotate(matrix);
        int[][] expectedResults = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};

        Assertions.assertArrayEquals(expectedResults, matrix);
    }

    @Test
    void Example2() {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        RotateImage.rotate(matrix);
        int[][] expectedResults = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};

        Assertions.assertArrayEquals(expectedResults, matrix);
    }
}
