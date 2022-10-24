import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MaximumLengthOfAConcatenatedStringWithUniqueCharactersTest {
    MaximumLengthOfAConcatenatedStringWithUniqueCharacters MaximumLengthOfAConcatenatedStringWithUniqueCharacters = new MaximumLengthOfAConcatenatedStringWithUniqueCharacters();

    @Test
    void Example1() {
        List<String> arr = Arrays.asList("un", "iq", "ue");
        int results = MaximumLengthOfAConcatenatedStringWithUniqueCharacters.maxLength(arr);
        int expectResults = 4;

        Assertions.assertEquals(expectResults, results);
    }

    @Test
    void Example2() {
        List<String> arr = Arrays.asList("cha", "r", "act", "ers");
        int results = MaximumLengthOfAConcatenatedStringWithUniqueCharacters.maxLength(arr);
        int expectResults = 6;

        Assertions.assertEquals(expectResults, results);
    }

    @Test
    void Example3() {
        List<String> arr = List.of("abcdefghijklmnopqrstuvwxyz");
        int results = MaximumLengthOfAConcatenatedStringWithUniqueCharacters.maxLength(arr);
        int expectResults = 26;

        Assertions.assertEquals(expectResults, results);
    }
}
