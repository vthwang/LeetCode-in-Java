import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromicSubstringsTest {
    PalindromicSubstrings PalindromicSubstrings = new PalindromicSubstrings();

    @Test
    void Example1() {
        String s = "abc";

        int results = PalindromicSubstrings.countSubstrings(s);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "aaa";

        int results = PalindromicSubstrings.countSubstrings(s);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }
}
