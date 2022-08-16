import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PermutationInStringTest {
    PermutationInString PermutationInString = new PermutationInString();

    @Test
    void Example1() {
        String s1 = "ab", s2 = "eidbaooo";
        boolean results = PermutationInString.checkInclusion(s1, s2);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s1 = "ab", s2 = "eidboaoo";
        boolean results = PermutationInString.checkInclusion(s1, s2);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
