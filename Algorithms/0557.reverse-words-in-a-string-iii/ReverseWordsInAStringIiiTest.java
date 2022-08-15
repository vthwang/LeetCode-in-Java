import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseWordsInAStringIiiTest {
    ReverseWordsInAStringIii ReverseWordsInAStringIii = new ReverseWordsInAStringIii();

    @Test
    void Example1() {
        String s = "Let's take LeetCode contest";
        String results = ReverseWordsInAStringIii.reverseWords(s);
        String expectedResults = "s'teL ekat edoCteeL tsetnoc";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "God Ding";
        String results = ReverseWordsInAStringIii.reverseWords(s);
        String expectedResults = "doG gniD";

        Assertions.assertEquals(expectedResults, results);
    }
}
