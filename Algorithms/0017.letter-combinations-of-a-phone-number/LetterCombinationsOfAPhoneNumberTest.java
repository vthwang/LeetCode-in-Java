import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumberTest {
    LetterCombinationsOfAPhoneNumber LetterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();

    @Test
    void Example1() {
        String digits = "23";
        List<String> results = LetterCombinationsOfAPhoneNumber.letterCombinations(digits);
        List<String> expectedResults = new ArrayList<>();
        expectedResults.add("ad");
        expectedResults.add("ae");
        expectedResults.add("af");
        expectedResults.add("bd");
        expectedResults.add("be");
        expectedResults.add("bf");
        expectedResults.add("cd");
        expectedResults.add("ce");
        expectedResults.add("cf");

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String digits = "";
        List<String> results = LetterCombinationsOfAPhoneNumber.letterCombinations(digits);
        List<String> expectedResults = new ArrayList<>();

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String digits = "2";
        List<String> results = LetterCombinationsOfAPhoneNumber.letterCombinations(digits);
        List<String> expectedResults = new ArrayList<>();
        expectedResults.add("a");
        expectedResults.add("b");
        expectedResults.add("c");

        Assertions.assertEquals(expectedResults, results);
    }
}
