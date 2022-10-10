import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BreakAPalindromeTest {
    BreakAPalindrome BreakAPalindrome = new BreakAPalindrome();

    @Test
    void Example1() {
        String palindrome = "abccba";
        String results = BreakAPalindrome.breakPalindrome(palindrome);
        String expectedResults = "aaccba";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String palindrome = "a";
        String results = BreakAPalindrome.breakPalindrome(palindrome);
        String expectedResults = "";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String palindrome = "aba";
        String results = BreakAPalindrome.breakPalindrome(palindrome);
        String expectedResults = "abb";

        Assertions.assertEquals(expectedResults, results);
    }
}
