import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TopKFrequentWordsTest {
    TopKFrequentWords TopKFrequentWords = new TopKFrequentWords();

    @Test
    void Example1() {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> results = TopKFrequentWords.topKFrequent(words, k);
        List<String> expectedResults = Arrays.asList("i", "love");

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        List<String> results = TopKFrequentWords.topKFrequent(words, k);
        List<String> expectedResults = Arrays.asList("the", "is", "sunny", "day");

        Assertions.assertEquals(expectedResults, results);
    }
}
