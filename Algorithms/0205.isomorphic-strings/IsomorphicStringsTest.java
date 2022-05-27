import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsomorphicStringsTest {
    IsomorphicStrings IsomorphicStrings = new IsomorphicStrings();

    @Test
    void Example1() {
        String s = "egg";
        String t = "add";

        boolean results = IsomorphicStrings.isIsomorphic(s, t);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "foo";
        String t = "bar";

        boolean results = IsomorphicStrings.isIsomorphic(s, t);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "paper";
        String t = "title";

        boolean results = IsomorphicStrings.isIsomorphic(s, t);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        String s = "ab";
        String t = "aa";

        boolean results = IsomorphicStrings.isIsomorphic(s, t);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
