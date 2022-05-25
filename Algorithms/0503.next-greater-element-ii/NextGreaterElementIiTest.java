import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NextGreaterElementIiTest {
    NextGreaterElementIi NextGreaterElementIi = new NextGreaterElementIi();

    @Test
    void Example1() {
        int[] temperatures = {1, 2, 1};
        int[] results = NextGreaterElementIi.nextGreaterElements(temperatures);
        int[] expectedResults = {2, -1, 2};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] temperatures = {1, 2, 3, 4, 3};
        int[] results = NextGreaterElementIi.nextGreaterElements(temperatures);
        int[] expectedResults = {2, 3, 4, -1, 4};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
