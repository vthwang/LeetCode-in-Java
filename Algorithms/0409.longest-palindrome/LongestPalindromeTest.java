import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTest {
    LongestPalindrome LongestPalindrome = new LongestPalindrome();

    @Test
    void Example1() {
        String s = "abccccdd";

        int results = LongestPalindrome.longestPalindrome(s);
        int expectedResults = 7;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "a";

        int results = LongestPalindrome.longestPalindrome(s);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "bb";

        int results = LongestPalindrome.longestPalindrome(s);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
