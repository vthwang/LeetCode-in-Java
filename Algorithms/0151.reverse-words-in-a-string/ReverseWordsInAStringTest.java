import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseWordsInAStringTest {
    ReverseWordsInAString ReverseWordsInAString = new ReverseWordsInAString();

    @Test
    void Example1() {
        String s = "the sky is blue";
        String results = ReverseWordsInAString.reverseWords(s);
        String expectedResults = "blue is sky the";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "  hello world  ";
        String results = ReverseWordsInAString.reverseWords(s);
        String expectedResults = "world hello";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "a good   example";
        String results = ReverseWordsInAString.reverseWords(s);
        String expectedResults = "example good a";

        Assertions.assertEquals(expectedResults, results);
    }
}
