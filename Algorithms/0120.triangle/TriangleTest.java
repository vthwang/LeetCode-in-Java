import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TriangleTest {
    Triangle Triangle = new Triangle();

    @Test
    void Example1() {
        List<List<Integer>> triangle = new LinkedList<>();
        triangle.add(List.of(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        int results = Triangle.minimumTotal(triangle);
        int expectedResult = 11;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        List<List<Integer>> triangle = new LinkedList<>();
        triangle.add(List.of(-10));
        int results = Triangle.minimumTotal(triangle);
        int expectedResult = -10;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example3() {
        List<List<Integer>> triangle = new LinkedList<>();
        triangle.add(List.of(-1));
        triangle.add(Arrays.asList(2, 3));
        triangle.add(Arrays.asList(1, -1, -3));
        int results = Triangle.minimumTotal(triangle);
        int expectedResult = -1;

        Assertions.assertEquals(expectedResult, results);
    }
}
