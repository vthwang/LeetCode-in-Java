import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScrambleStringTest {
    ScrambleString scrambleString = new ScrambleString();

    @Test
    void Example1() {
        String s1 = "great", s2 = "rgeat";

        Assertions.assertTrue(scrambleString.isScramble(s1, s2));
    }

    @Test
    void Example2() {
        String s1 = "abcde", s2 = "caebd";

        Assertions.assertFalse(scrambleString.isScramble(s1, s2));
    }

    @Test
    void Example3() {
        String s1 = "a", s2 = "a";

        Assertions.assertTrue(scrambleString.isScramble(s1, s2));
    }
}
