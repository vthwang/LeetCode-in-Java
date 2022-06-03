import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerOfFourTest {
    PowerOfFour PowerOfFour = new PowerOfFour();

    @Test
    void Example1() {
        int n = 16;
        boolean results = PowerOfFour.isPowerOfFour(n);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 5;
        boolean results = PowerOfFour.isPowerOfFour(n);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int n = 1;
        boolean results = PowerOfFour.isPowerOfFour(n);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }
}
