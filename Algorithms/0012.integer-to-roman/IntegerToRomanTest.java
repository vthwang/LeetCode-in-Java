import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {
    IntegerToRoman IntegerToRoman = new IntegerToRoman();

    @Test
    void Example1() {
        int num = 3;
        String results = IntegerToRoman.intToRoman(num);
        String expectedResults = "III";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int num = 58;
        String results = IntegerToRoman.intToRoman(num);
        String expectedResults = "LVIII";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int num = 1994;
        String results = IntegerToRoman.intToRoman(num);
        String expectedResults = "MCMXCIV";

        Assertions.assertEquals(expectedResults, results);
    }
}
