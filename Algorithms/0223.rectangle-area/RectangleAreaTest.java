import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleAreaTest {
    RectangleArea RectangleArea = new RectangleArea();

    @Test
    void Example1() {
        int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
        int results = RectangleArea.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        int expectedResults = 45;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2;
        int results = RectangleArea.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        int expectedResults = 16;

        Assertions.assertEquals(expectedResults, results);
    }
}
