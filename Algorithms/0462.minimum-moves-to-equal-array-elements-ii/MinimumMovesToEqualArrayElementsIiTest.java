import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumMovesToEqualArrayElementsIiTest {
    MinimumMovesToEqualArrayElementsIi MinimumMovesToEqualArrayElementsIi = new MinimumMovesToEqualArrayElementsIi();
    MinimumMovesToEqualArrayElementsIi2 MinimumMovesToEqualArrayElementsIi2 = new MinimumMovesToEqualArrayElementsIi2();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3};
        int results = MinimumMovesToEqualArrayElementsIi.minMoves2(nums);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);

        results = MinimumMovesToEqualArrayElementsIi2.minMoves2(nums);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 10, 2, 9};
        int results = MinimumMovesToEqualArrayElementsIi.minMoves2(nums);
        int expectedResults = 16;

        Assertions.assertEquals(expectedResults, results);

        results = MinimumMovesToEqualArrayElementsIi2.minMoves2(nums);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {1, 2};
        int results = MinimumMovesToEqualArrayElementsIi.minMoves2(nums);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);

        results = MinimumMovesToEqualArrayElementsIi2.minMoves2(nums);
        Assertions.assertEquals(expectedResults, results);
    }
}
