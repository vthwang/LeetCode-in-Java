import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NThTribonacciNumberTest {
    NThTribonacciNumber nThTribonacciNumber = new NThTribonacciNumber();

    @Test
    void Example1() {
        int n = 4;

        Assertions.assertEquals(4, nThTribonacciNumber.tribonacci(n));
    }

    @Test
    void Example2() {
        int n = 25;

        Assertions.assertEquals(1389537, nThTribonacciNumber.tribonacci(n));
    }
}
