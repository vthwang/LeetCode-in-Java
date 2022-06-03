import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseBitsTest {
    ReverseBits ReverseBits = new ReverseBits();

    @Test
    void Example1() {
        int n = 43261596;
        int results = ReverseBits.reverseBits(n);
        int expectedResults = 964176192;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = Integer.parseUnsignedInt("4294967293");
        int results = ReverseBits.reverseBits(n);
        int expectedResults = Integer.parseUnsignedInt("3221225471");

        Assertions.assertEquals(expectedResults, results);
    }
}
