import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    ReverseString ReverseString = new ReverseString();

    @Test
    void Example1() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        ReverseString.reverseString(s);
        char[] expectedResults = {'o', 'l', 'l', 'e', 'h'};

        Assertions.assertArrayEquals(expectedResults, s);
    }

    @Test
    void Example2() {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        ReverseString.reverseString(s);
        char[] expectedResults = {'h', 'a', 'n', 'n', 'a', 'H'};

        Assertions.assertArrayEquals(expectedResults, s);
    }
}
