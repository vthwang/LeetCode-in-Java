import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOf1BitsTest {
    NumberOf1Bits NumberOf1Bits = new NumberOf1Bits();

    @Test
    void Example1() {
        int n = 521;
        int results = NumberOf1Bits.hammingWeight(n);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 2097152;
        int results = NumberOf1Bits.hammingWeight(n);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int n = -3;
        int results = NumberOf1Bits.hammingWeight(n);
        int expectedResults = 31;

        Assertions.assertEquals(expectedResults, results);
    }
}
