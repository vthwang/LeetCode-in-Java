import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {
    LongestCommonPrefix LongestCommonPrefix = new LongestCommonPrefix();

    @Test
    void Example1() {
        String[] strs = {"flower", "flow", "flight"};
        String results = LongestCommonPrefix.longestCommonPrefix(strs);
        String expectedResults = "fl";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String[] strs = {"dog", "racecar", "car"};
        String results = LongestCommonPrefix.longestCommonPrefix(strs);
        String expectedResults = "";

        Assertions.assertEquals(expectedResults, results);
    }
}
