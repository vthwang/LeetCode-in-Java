import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring LongestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    void Example1() {
        String s = "babad";
        String results = LongestPalindromicSubstring.longestPalindrome(s);
        String expectedResults = "bab";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "cbbd";
        String results = LongestPalindromicSubstring.longestPalindrome(s);
        String expectedResults = "bb";

        Assertions.assertEquals(expectedResults, results);
    }
}
