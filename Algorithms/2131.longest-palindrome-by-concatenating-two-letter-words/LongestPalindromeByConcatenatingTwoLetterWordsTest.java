import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeByConcatenatingTwoLetterWordsTest {
    LongestPalindromeByConcatenatingTwoLetterWords LongestPalindromeByConcatenatingTwoLetterWords = new LongestPalindromeByConcatenatingTwoLetterWords();

    @Test
    void Example1() {
        String[] words = {"lc", "cl", "gg"};
        int results = LongestPalindromeByConcatenatingTwoLetterWords.longestPalindrome(words);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String[] words = {"ab", "ty", "yt", "lc", "cl", "ab"};
        int results = LongestPalindromeByConcatenatingTwoLetterWords.longestPalindrome(words);
        int expectedResults = 8;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String[] words = {"cc", "ll", "xx"};
        int results = LongestPalindromeByConcatenatingTwoLetterWords.longestPalindrome(words);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
