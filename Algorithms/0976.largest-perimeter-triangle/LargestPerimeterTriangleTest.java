import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestPerimeterTriangleTest {
    LargestPerimeterTriangle LargestPerimeterTriangle = new LargestPerimeterTriangle();

    @Test
    void Example1() {
        int[] nums = {2, 1, 2};
        int results = LargestPerimeterTriangle.largestPerimeter(nums);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 2, 1};
        int results = LargestPerimeterTriangle.largestPerimeter(nums);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
