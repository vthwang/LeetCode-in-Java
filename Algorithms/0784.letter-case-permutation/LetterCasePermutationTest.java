import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class LetterCasePermutationTest {
    LetterCasePermutation LetterCasePermutation = new LetterCasePermutation();

    @Test
    void Example1() {
        String s = "a1b2";
        List<String> results = LetterCasePermutation.letterCasePermutation(s);
        List<String> expectedResults = Arrays.asList("A1B2", "A1b2", "a1B2", "a1b2");

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "3z4";
        List<String> results = LetterCasePermutation.letterCasePermutation(s);
        List<String> expectedResults = Arrays.asList("3Z4", "3z4");

        Assertions.assertEquals(expectedResults, results);
    }
}
