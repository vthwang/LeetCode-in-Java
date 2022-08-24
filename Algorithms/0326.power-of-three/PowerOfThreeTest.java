import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerOfThreeTest {
    PowerOfThree PowerOfThree = new PowerOfThree();

    @Test
    void Example1() {
        int n = 27;
        boolean results = PowerOfThree.isPowerOfThree(n);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 0;
        boolean results = PowerOfThree.isPowerOfThree(n);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int n = 9;
        boolean results = PowerOfThree.isPowerOfThree(n);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        int n = 1;
        boolean results = PowerOfThree.isPowerOfThree(n);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example5() {
        int n = 45;
        boolean results = PowerOfThree.isPowerOfThree(n);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
