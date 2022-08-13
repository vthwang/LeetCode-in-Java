import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstringWithConcatenationOfAllWordsTest {
    SubstringWithConcatenationOfAllWords SubstringWithConcatenationOfAllWords = new SubstringWithConcatenationOfAllWords();

    @Test
    void Example1() {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> results = SubstringWithConcatenationOfAllWords.findSubstring(s, words);
        List<Integer> expectedResults = Arrays.asList(0, 9);

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "word"};
        List<Integer> results = SubstringWithConcatenationOfAllWords.findSubstring(s, words);
        List<Integer> expectedResults = new ArrayList<>();

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar", "foo", "the"};
        List<Integer> results = SubstringWithConcatenationOfAllWords.findSubstring(s, words);
        List<Integer> expectedResults = Arrays.asList(6, 9, 12);

        Assertions.assertEquals(expectedResults, results);
    }
}
