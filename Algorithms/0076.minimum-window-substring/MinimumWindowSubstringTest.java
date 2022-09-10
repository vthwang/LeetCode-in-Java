import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumWindowSubstringTest {
    MinimumWindowSubstring MinimumWindowSubstring = new MinimumWindowSubstring();

    @Test
    void Example1() {
        String s = "ADOBECODEBANC", t = "ABC";
        String results = MinimumWindowSubstring.minWindow(s, t);
        String expectedResults = "BANC";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "a", t = "a";
        String results = MinimumWindowSubstring.minWindow(s, t);
        String expectedResults = "a";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "a", t = "aa";
        String results = MinimumWindowSubstring.minWindow(s, t);
        String expectedResults = "";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        String s = "ab", t = "b";
        String results = MinimumWindowSubstring.minWindow(s, t);
        String expectedResults = "b";

        Assertions.assertEquals(expectedResults, results);
    }
}
