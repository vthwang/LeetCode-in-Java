import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfSquareNumbersTest {
    SumOfSquareNumbers sumOfSquareNumbers = new SumOfSquareNumbers();

    @Test
    void Example1() {
        int c = 5;
        boolean expectedResults = true;

        boolean results;

        results = sumOfSquareNumbers.judgeSquareSum(c);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int c = 3;
        boolean expectedResults = false;

        boolean results;

        results = sumOfSquareNumbers.judgeSquareSum(c);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int c = 2;
        boolean expectedResults = true;

        boolean results;

        results = sumOfSquareNumbers.judgeSquareSum(c);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        int c = 2147483600;
        boolean expectedResults = true;

        boolean results;

        results = sumOfSquareNumbers.judgeSquareSum(c);
        Assertions.assertEquals(expectedResults, results);
    }
}
