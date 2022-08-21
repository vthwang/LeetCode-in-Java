import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StampingTheSequenceTest {
    StampingTheSequence StampingTheSequence = new StampingTheSequence();

    @Test
    void Example1() {
        String stamp = "abc", target = "ababc";
        int[] results = StampingTheSequence.movesToStamp(stamp, target);
        int[] expectedResults = {0, 2};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String stamp = "abca", target = "aabcaca";
        int[] results = StampingTheSequence.movesToStamp(stamp, target);
        int[] expectedResults = {0, 3, 1};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
