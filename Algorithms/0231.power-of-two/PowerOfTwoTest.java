import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerOfTwoTest {
    PowerOfTwo PowerOfTwo = new PowerOfTwo();

    @Test
    void Example1() {
        int n = 1;
        boolean results = PowerOfTwo.isPowerOfTwo(n);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 16;
        boolean results = PowerOfTwo.isPowerOfTwo(n);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int n = 3;
        boolean results = PowerOfTwo.isPowerOfTwo(n);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
