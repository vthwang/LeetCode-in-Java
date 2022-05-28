import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountBinarySubstringsTest {
    CountBinarySubstrings CountBinarySubstrings = new CountBinarySubstrings();

    @Test
    void Example1() {
        String s = "00110011";

        int results = CountBinarySubstrings.countBinarySubstrings(s);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "10101";

        int results = CountBinarySubstrings.countBinarySubstrings(s);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }
}
