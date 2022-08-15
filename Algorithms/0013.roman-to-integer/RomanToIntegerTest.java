import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {
    RomanToInteger RomanToInteger = new RomanToInteger();

    @Test
    void Example1() {
        String s = "III";
        int results = RomanToInteger.romanToInt(s);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "LVIII";
        int results = RomanToInteger.romanToInt(s);
        int expectedResults = 58;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "MCMXCIV";
        int results = RomanToInteger.romanToInt(s);
        int expectedResults = 1994;

        Assertions.assertEquals(expectedResults, results);
    }
}
