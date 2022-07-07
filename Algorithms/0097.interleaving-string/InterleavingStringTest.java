import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InterleavingStringTest {
    InterleavingString InterleavingString = new InterleavingString();

    @Test
    void Example1() {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        boolean results = InterleavingString.isInterleave(s1, s2, s3);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
        boolean results = InterleavingString.isInterleave(s1, s2, s3);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s1 = "", s2 = "", s3 = "";
        boolean results = InterleavingString.isInterleave(s1, s2, s3);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }
}
