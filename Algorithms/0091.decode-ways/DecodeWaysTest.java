import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecodeWaysTest {
    DecodeWays DecodeWays = new DecodeWays();

    @Test
    void Example1() {
        String s = "12";
        int results = DecodeWays.numDecodings(s);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "226";
        int results = DecodeWays.numDecodings(s);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "06";
        int results = DecodeWays.numDecodings(s);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        String s = "10";
        int results = DecodeWays.numDecodings(s);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
