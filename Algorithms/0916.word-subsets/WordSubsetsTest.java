import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class WordSubsetsTest {
    WordSubsets WordSubsets = new WordSubsets();

    @Test
    void Example1() {
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"},  words2 = {"e", "o"};
        List<String> result = WordSubsets.wordSubsets(words1, words2);
        List<String> expectedResults = Arrays.asList("facebook", "google", "leetcode");

        Assertions.assertEquals(expectedResults, result);
    }

    @Test
    void Example2() {
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"},  words2 = {"l", "e"};
        List<String> result = WordSubsets.wordSubsets(words1, words2);
        List<String> expectedResults = Arrays.asList("apple", "google", "leetcode");

        Assertions.assertEquals(expectedResults, result);
    }
}
