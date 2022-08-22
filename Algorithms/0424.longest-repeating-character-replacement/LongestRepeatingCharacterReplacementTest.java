import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestRepeatingCharacterReplacementTest {
    LongestRepeatingCharacterReplacement LongestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();

    @Test
    void Example1() {
        String s = "ABAB";
        int k = 2;
        int results = LongestRepeatingCharacterReplacement.characterReplacement(s, k);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "AABABBA";
        int k = 1;
        int results = LongestRepeatingCharacterReplacement.characterReplacement(s, k);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }
}
