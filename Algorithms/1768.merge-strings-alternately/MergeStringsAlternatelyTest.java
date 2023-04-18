import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeStringsAlternatelyTest {
    MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();

    @Test
    void Example1() {
        String word1 = "abc", word2 = "pqr";

        Assertions.assertEquals("apbqcr", mergeStringsAlternately.mergeAlternately(word1, word2));
    }

    @Test
    void Example2() {
        String word1 = "ab", word2 = "pqrs";

        Assertions.assertEquals("apbqrs", mergeStringsAlternately.mergeAlternately(word1, word2));
    }

    @Test
    void Example3() {
        String word1 = "abcd", word2 = "pq";

        Assertions.assertEquals("apbqcd", mergeStringsAlternately.mergeAlternately(word1, word2));
    }
}
