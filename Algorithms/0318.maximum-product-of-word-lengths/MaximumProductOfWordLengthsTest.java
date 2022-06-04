import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumProductOfWordLengthsTest {
    MaximumProductOfWordLengths MaximumProductOfWordLengths = new MaximumProductOfWordLengths();

    @Test
    void Example1() {
        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        int results = MaximumProductOfWordLengths.maxProduct(words);
        int expectedResults = 16;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String[] words = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        int results = MaximumProductOfWordLengths.maxProduct(words);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String[] words = {"a", "aa", "aaa", "aaaa"};
        int results = MaximumProductOfWordLengths.maxProduct(words);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
