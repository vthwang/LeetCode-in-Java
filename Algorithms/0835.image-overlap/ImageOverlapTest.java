import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImageOverlapTest {
    ImageOverlap ImageOverlap = new ImageOverlap();

    @Test
    void Example1() {
        int[][] img1 = {{1, 1, 0}, {0, 1, 0}, {0, 1, 0}},  img2 = {{0, 0, 0}, {0, 1, 1}, {0, 0, 1}};
        int results = ImageOverlap.largestOverlap(img1, img2);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] img1 = {{1}}, img2 = {{1}};
        int results = ImageOverlap.largestOverlap(img1, img2);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[][] img1 = {{0}}, img2 = {{0}};
        int results = ImageOverlap.largestOverlap(img1, img2);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        int[][] img1 = {{0, 1, 1, 1}, {0, 1, 1, 1}, {0, 1, 1, 1}, {0, 0, 0, 0}},  img2 = {{0, 0, 0, 0}, {1, 1, 1, 0}, {1, 1, 1, 0}, {1, 1, 1, 0}};
        int results = ImageOverlap.largestOverlap(img1, img2);
        int expectedResults = 9;

        Assertions.assertEquals(expectedResults, results);
    }
}
