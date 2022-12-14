import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonSubsequenceTest {
    LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

    @Test
    void Example1() {
        String text1 = "abcde", text2 = "ace";

        Assertions.assertEquals(3, longestCommonSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    void Example2() {
        String text1 = "abc", text2 = "abc";

        Assertions.assertEquals(3, longestCommonSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    void Example3() {
        String text1 = "abc", text2 = "def";

        Assertions.assertEquals(0, longestCommonSubsequence.longestCommonSubsequence(text1, text2));
    }
}
