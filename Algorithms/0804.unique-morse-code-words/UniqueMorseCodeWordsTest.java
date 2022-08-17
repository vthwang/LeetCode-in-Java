import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueMorseCodeWordsTest {
    UniqueMorseCodeWords UniqueMorseCodeWords = new UniqueMorseCodeWords();

    @Test
    void Example1() {
        String[] words = {"gin","zen","gig","msg"};
        int results = UniqueMorseCodeWords.uniqueMorseRepresentations(words);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String[] words = {"a"};
        int results = UniqueMorseCodeWords.uniqueMorseRepresentations(words);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
