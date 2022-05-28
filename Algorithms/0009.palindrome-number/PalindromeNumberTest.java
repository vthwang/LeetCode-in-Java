import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
    PalindromeNumber PalindromeNumber = new PalindromeNumber();

    @Test
    void Example1() {
        int x = 121;

        boolean results = PalindromeNumber.isPalindrome(x);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int x = -121;

        boolean results = PalindromeNumber.isPalindrome(x);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int x = 10;

        boolean results = PalindromeNumber.isPalindrome(x);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
