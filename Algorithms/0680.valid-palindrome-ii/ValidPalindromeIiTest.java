import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeIiTest {
    ValidPalindromeIi ValidPalindromeIi = new ValidPalindromeIi();

    @Test
    void Example1() {
        String s = "aba";
        boolean expectedResults = true;

        boolean results;

        results = ValidPalindromeIi.validPalindrome(s);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "abca";
        boolean expectedResults = true;

        boolean results;

        results = ValidPalindromeIi.validPalindrome(s);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "abc";
        boolean expectedResults = false;

        boolean results;

        results = ValidPalindromeIi.validPalindrome(s);
        Assertions.assertEquals(expectedResults, results);
    }
}
