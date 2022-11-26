import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfSubarrayMinimumsTest {
    SumOfSubarrayMinimums sumOfSubarrayMinimums = new SumOfSubarrayMinimums();

    @Test
    void Example1() {
        int[] arr = {3, 1, 2, 4};
        int results = sumOfSubarrayMinimums.sumSubarrayMins(arr);

        Assertions.assertEquals(17, results);
    }

    @Test
    void Example2() {
        int[] arr = {11, 81, 94, 43, 3};
        int results = sumOfSubarrayMinimums.sumSubarrayMins(arr);

        Assertions.assertEquals(444, results);
    }
}
