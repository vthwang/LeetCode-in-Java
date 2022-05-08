import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseVowelsOfAStringTest {
    ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString();

    @Test
    void Example1() {
        String s = "hello";
        String expectedResults = "holle";

        String results;

        results = reverseVowelsOfAString.reverseVowels(s);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "leetcode";
        String expectedResults = "leotcede";

        String results;

        results = reverseVowelsOfAString.reverseVowels(s);
        Assertions.assertEquals(expectedResults, results);
    }
}
