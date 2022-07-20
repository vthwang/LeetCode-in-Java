import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfMatchingSubsequencesTest {
    NumberOfMatchingSubsequences NumberOfMatchingSubsequences = new NumberOfMatchingSubsequences();
    NumberOfMatchingSubsequences2 NumberOfMatchingSubsequences2 = new NumberOfMatchingSubsequences2();

    @Test
    void Example1() {
        String s = "abcde";
        String[] words = {"a", "bb", "acd", "ace"};
        int results = NumberOfMatchingSubsequences.numMatchingSubseq(s, words);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);

        results = NumberOfMatchingSubsequences2.numMatchingSubseq(s, words);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "dsahjpjauf";
        String[] words = {"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"};
        int results = NumberOfMatchingSubsequences.numMatchingSubseq(s, words);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);

        results = NumberOfMatchingSubsequences2.numMatchingSubseq(s, words);
        Assertions.assertEquals(expectedResults, results);
    }
}
