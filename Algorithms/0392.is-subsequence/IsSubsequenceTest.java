import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {
    IsSubsequence IsSubsequence = new IsSubsequence();

    @Test
    void Example1() {
        String s = "abc", t = "ahbgdc";
        boolean results = IsSubsequence.isSubsequence(s, t);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "axc", t = "ahbgdc";
        boolean results = IsSubsequence.isSubsequence(s, t);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
