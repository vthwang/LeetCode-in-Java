import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters LongestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void Example1() {
        String s = "abcabcbb";
        int results = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "bbbbb";
        int results = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "pwwkew";
        int results = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }
}
