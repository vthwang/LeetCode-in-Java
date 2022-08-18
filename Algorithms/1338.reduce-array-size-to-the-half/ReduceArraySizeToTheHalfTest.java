import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReduceArraySizeToTheHalfTest {
    ReduceArraySizeToTheHalf ReduceArraySizeToTheHalf = new ReduceArraySizeToTheHalf();

    @Test
    void Example1() {
        int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        int results = ReduceArraySizeToTheHalf.minSetSize(arr);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] arr = {7, 7, 7, 7, 7, 7};
        int results = ReduceArraySizeToTheHalf.minSetSize(arr);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
