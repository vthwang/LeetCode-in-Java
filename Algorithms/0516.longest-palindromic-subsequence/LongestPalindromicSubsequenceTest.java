import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubsequenceTest {
    LongestPalindromicSubsequence longestPalindromicSubsequence = new LongestPalindromicSubsequence();

    @Test
    void Example1() {
        String s = "bbbab";

        Assertions.assertEquals(4, longestPalindromicSubsequence.longestPalindromeSubseq(s));
    }

    @Test
    void Example2() {
        String s = "cbbd";

        Assertions.assertEquals(2, longestPalindromicSubsequence.longestPalindromeSubseq(s));
    }
}
