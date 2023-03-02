import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCompressionTest {
    StringCompression stringCompression = new StringCompression();

    @Test
    void Example1() {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        Assertions.assertEquals(6, stringCompression.compress(chars));
    }

    @Test
    void Example2() {
        char[] chars = {'a'};

        Assertions.assertEquals(1, stringCompression.compress(chars));
    }

    @Test
    void Example3() {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};

        Assertions.assertEquals(4, stringCompression.compress(chars));
    }
}
