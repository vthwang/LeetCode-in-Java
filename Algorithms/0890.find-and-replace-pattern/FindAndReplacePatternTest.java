import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FindAndReplacePatternTest {
    FindAndReplacePattern FindAndReplacePattern = new FindAndReplacePattern();

    @Test
    void Example1() {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        List<String> result = FindAndReplacePattern.findAndReplacePattern(words, pattern);
        List<String> expectedResults = Arrays.asList("mee", "aqq");

        Assertions.assertEquals(expectedResults, result);
    }

    @Test
    void Example2() {
        String[] words = {"a", "b", "c"};
        String pattern = "a";
        List<String> result = FindAndReplacePattern.findAndReplacePattern(words, pattern);
        List<String> expectedResults = Arrays.asList("a", "b",  "c");

        Assertions.assertEquals(expectedResults, result);
    }
}
