import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestIncreasingSubsequenceTest {
    LongestIncreasingSubsequence LongestIncreasingSubsequence = new LongestIncreasingSubsequence();

    @Test
    void Example1() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int results = LongestIncreasingSubsequence.lengthOfLIS(nums);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {0, 1, 0, 3, 2, 3};
        int results = LongestIncreasingSubsequence.lengthOfLIS(nums);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {7, 7, 7, 7, 7, 7, 7};
        int results = LongestIncreasingSubsequence.lengthOfLIS(nums);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
