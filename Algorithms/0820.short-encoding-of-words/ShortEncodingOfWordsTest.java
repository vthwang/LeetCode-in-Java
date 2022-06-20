import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortEncodingOfWordsTest {
    ShortEncodingOfWords ShortEncodingOfWords = new ShortEncodingOfWords();

    @Test
    void Example1() {
        String[] words = {"time", "me", "bell"};
        int results = ShortEncodingOfWords.minimumLengthEncoding(words);
        int expectedResults = 10;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String[] words = {"t"};
        int results = ShortEncodingOfWords.minimumLengthEncoding(words);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
