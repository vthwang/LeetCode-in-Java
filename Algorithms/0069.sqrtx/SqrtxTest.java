import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtxTest {
    Sqrtx Sqrtx = new Sqrtx();

    @Test
    void Example1() {
        int x = 4;
        int results = Sqrtx.mySqrt(x);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int x = 8;
        int results = Sqrtx.mySqrt(x);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
