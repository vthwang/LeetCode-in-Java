import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountingBitsTest {
    CountingBits CountingBits = new CountingBits();

    @Test
    void Example1() {
        int n = 2;
        int[] results = CountingBits.countBits(n);
        int[] expectedResults = {0, 1, 1};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 5;
        int[] results = CountingBits.countBits(n);
        int[] expectedResults = {0, 1, 1, 2, 1, 2};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
