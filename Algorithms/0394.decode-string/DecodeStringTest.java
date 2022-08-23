import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecodeStringTest {
    DecodeString DecodeString = new DecodeString();

    @Test
    void Example1() {
        String s = "3[a]2[bc]";
        String results = DecodeString.decodeString(s);
        String expectedResults = "aaabcbc";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "3[a2[c]]";
        String results = DecodeString.decodeString(s);
        String expectedResults = "accaccacc";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "2[abc]3[cd]ef";
        String results = DecodeString.decodeString(s);
        String expectedResults = "abcabccdcdcdef";

        Assertions.assertEquals(expectedResults, results);
    }
}
