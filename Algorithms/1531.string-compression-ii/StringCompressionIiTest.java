import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCompressionIiTest {
    StringCompressionIi StringCompressionIi = new StringCompressionIi();

    @Test
    void Example1() {
        String s = "aaabcccd";
        int k = 2;
        int results = StringCompressionIi.getLengthOfOptimalCompression(s, k);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "aabbaa";
        int k = 2;
        int results = StringCompressionIi.getLengthOfOptimalCompression(s, k);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "aaaaaaaaaaa";
        int k = 0;
        int results = StringCompressionIi.getLengthOfOptimalCompression(s, k);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }
}
