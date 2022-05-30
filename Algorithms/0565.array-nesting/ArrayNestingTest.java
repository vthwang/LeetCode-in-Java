import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayNestingTest {
    ArrayNesting ArrayNesting = new ArrayNesting();

    @Test
    void Example1() {
        int[] nums = {5, 4, 0, 3, 1, 6, 2};
        int results = ArrayNesting.arrayNesting(nums);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {0, 1, 2};
        int results = ArrayNesting.arrayNesting(nums);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
