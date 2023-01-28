import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ConcatenatedWordsTest {
    ConcatenatedWords concatenatedWords = new ConcatenatedWords();

    @Test
    void Example1() {
        String[] words = {"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"};
        List<String> expectedResults = Arrays.asList("catsdogcats", "dogcatsdog", "ratcatdogcat");

        Assertions.assertTrue(expectedResults.containsAll(concatenatedWords.findAllConcatenatedWordsInADict(words)));
    }

    @Test
    void Example2() {
        String[] words = {"cat","dog","catdog"};
        List<String> expectedResults = List.of("catdog");

        Assertions.assertTrue(expectedResults.containsAll(concatenatedWords.findAllConcatenatedWordsInADict(words)));
    }
}
