import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UglyNumberTest {
    UglyNumber UglyNumber = new UglyNumber();

    @Test
    void Example1() {
        int n = 6;
        boolean results = UglyNumber.isUgly(n);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 1;
        boolean results = UglyNumber.isUgly(n);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int n = 14;
        boolean results = UglyNumber.isUgly(n);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
