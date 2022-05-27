import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestConsecutiveSequenceTest {
    LongestConsecutiveSequence LongestConsecutiveSequence = new LongestConsecutiveSequence();

    @Test
    void Example1() {
        int[] nums = {100, 4, 200, 1, 3, 2};

        int results = LongestConsecutiveSequence.longestConsecutive(nums);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        int results = LongestConsecutiveSequence.longestConsecutive(nums);
        int expectedResults = 9;

        Assertions.assertEquals(expectedResults, results);
    }
}
