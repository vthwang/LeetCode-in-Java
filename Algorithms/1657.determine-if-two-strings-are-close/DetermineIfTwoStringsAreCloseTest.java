import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DetermineIfTwoStringsAreCloseTest {
    DetermineIfTwoStringsAreClose determineIfTwoStringsAreClose = new DetermineIfTwoStringsAreClose();

    @Test
    void Example1() {
        String word1 = "abc", word2 = "bca";
        boolean results = determineIfTwoStringsAreClose.closeStrings(word1, word2);

        Assertions.assertTrue(results);
    }

    @Test
    void Example2() {
        String word1 = "a", word2 = "aa";
        boolean results = determineIfTwoStringsAreClose.closeStrings(word1, word2);

        Assertions.assertFalse(results);
    }

    @Test
    void Example3() {
        String word1 = "cabbba", word2 = "abbccc";
        boolean results = determineIfTwoStringsAreClose.closeStrings(word1, word2);

        Assertions.assertTrue(results);
    }
}
