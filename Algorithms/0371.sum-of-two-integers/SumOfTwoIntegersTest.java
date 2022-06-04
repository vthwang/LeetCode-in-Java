import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfTwoIntegersTest {
    SumOfTwoIntegers SumOfTwoIntegers = new SumOfTwoIntegers();

    @Test
    void Example1() {
        int a = 1, b = 2;
        int results = SumOfTwoIntegers.getSum(a, b);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int a = 2, b = 3;
        int results = SumOfTwoIntegers.getSum(a, b);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);
    }
}
