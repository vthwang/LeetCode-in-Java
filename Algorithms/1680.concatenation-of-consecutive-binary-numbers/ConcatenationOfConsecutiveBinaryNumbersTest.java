import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConcatenationOfConsecutiveBinaryNumbersTest {
    ConcatenationOfConsecutiveBinaryNumbers ConcatenationOfConsecutiveBinaryNumbers = new ConcatenationOfConsecutiveBinaryNumbers();

    @Test
    void Example1() {
        int n = 1;
        int results = ConcatenationOfConsecutiveBinaryNumbers.concatenatedBinary(n);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 3;
        int results = ConcatenationOfConsecutiveBinaryNumbers.concatenatedBinary(n);
        int expectedResults = 27;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int n = 12;
        int results = ConcatenationOfConsecutiveBinaryNumbers.concatenatedBinary(n);
        int expectedResults = 505379714;

        Assertions.assertEquals(expectedResults, results);
    }
}
