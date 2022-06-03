import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryNumberWithAlternatingBitsTest {
    BinaryNumberWithAlternatingBits BinaryNumberWithAlternatingBits = new BinaryNumberWithAlternatingBits();

    @Test
    void Example1() {
        int n = 5;
        boolean results = BinaryNumberWithAlternatingBits.hasAlternatingBits(n);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 7;
        boolean results = BinaryNumberWithAlternatingBits.hasAlternatingBits(n);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int n = 11;
        boolean results = BinaryNumberWithAlternatingBits.hasAlternatingBits(n);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
