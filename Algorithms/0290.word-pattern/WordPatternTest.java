import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordPatternTest {
    WordPattern wordPattern = new WordPattern();

    @Test
    void Example1() {
        String pattern = "abba", s = "dog cat cat dog";

        Assertions.assertTrue(wordPattern.wordPattern(pattern, s));
    }

    @Test
    void Example2() {
        String pattern = "abba", s = "dog cat cat fish";

        Assertions.assertFalse(wordPattern.wordPattern(pattern, s));
    }

    @Test
    void Example3() {
        String pattern = "aaaa", s = "dog cat cat dog";

        Assertions.assertFalse(wordPattern.wordPattern(pattern, s));
    }

    @Test
    void Example4() {
        String pattern = "abba", s = "dog dog dog dog";

        Assertions.assertFalse(wordPattern.wordPattern(pattern, s));
    }

    @Test
    void Example5() {
        String pattern = "jquery", s = "jquery";

        Assertions.assertFalse(wordPattern.wordPattern(pattern, s));
    }
}
