import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckIfTwoStringArraysAreEquivalentTest {
    CheckIfTwoStringArraysAreEquivalent CheckIfTwoStringArraysAreEquivalent = new CheckIfTwoStringArraysAreEquivalent();

    @Test
    void Example1() {
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        boolean results = CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String[] word1 = {"a", "cb"}, word2 = {"ab", "c"};
        boolean results = CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String[] word1 = {"abc", "d", "defg"}, word2 = {"abcddefg"};
        boolean results = CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }
}
