import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestHarmoniousSubsequenceTest {
    LongestHarmoniousSubsequence LongestHarmoniousSubsequence = new LongestHarmoniousSubsequence();

    @Test
    void Example1() {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};

        int results = LongestHarmoniousSubsequence.findLHS(nums);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 2, 3, 4};

        int results = LongestHarmoniousSubsequence.findLHS(nums);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {1, 1, 1, 1};

        int results = LongestHarmoniousSubsequence.findLHS(nums);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
