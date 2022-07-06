import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciNumberTest {
    FibonacciNumber FibonacciNumber = new FibonacciNumber();
    FibonacciNumber2 FibonacciNumber2 = new FibonacciNumber2();

    @Test
    void Example1() {
        int n = 2;
        int results = FibonacciNumber.fib(n);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);

        results = FibonacciNumber2.fib(n);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 3;
        int results = FibonacciNumber.fib(n);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);

        results = FibonacciNumber2.fib(n);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int n = 4;
        int results = FibonacciNumber.fib(n);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);

        results = FibonacciNumber2.fib(n);
        Assertions.assertEquals(expectedResults, results);
    }
}
