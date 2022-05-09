import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class LongestWordInDictionaryThroughDeletingTest {
    LongestWordInDictionaryThroughDeleting LongestWordInDictionaryThroughDeleting = new LongestWordInDictionaryThroughDeleting();

    @Test
    void Example1() {
        String s = "abpcplea";
        List<String> dictionary = Arrays.asList("ale","apple","monkey","plea");
        String expectedResults = "apple";

        String results;

        results = LongestWordInDictionaryThroughDeleting.findLongestWord(s, dictionary);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "abpcplea";
        List<String> dictionary = Arrays.asList("a","b","c");
        String expectedResults = "a";

        String results;

        results = LongestWordInDictionaryThroughDeleting.findLongestWord(s, dictionary);
        Assertions.assertEquals(expectedResults, results);
    }
}
