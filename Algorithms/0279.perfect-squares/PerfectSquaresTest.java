import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerfectSquaresTest {
    PerfectSquares PerfectSquares = new PerfectSquares();

    @Test
    void Example1() {
        int n = 12;
        int results = PerfectSquares.numSquares(n);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int n = 13;
        int results = PerfectSquares.numSquares(n);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
