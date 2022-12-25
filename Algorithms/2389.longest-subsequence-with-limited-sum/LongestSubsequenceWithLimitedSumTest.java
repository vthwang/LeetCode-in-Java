import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubsequenceWithLimitedSumTest {
    LongestSubsequenceWithLimitedSum longestSubsequenceWithLimitedSum = new LongestSubsequenceWithLimitedSum();
    LongestSubsequenceWithLimitedSum2 longestSubsequenceWithLimitedSum2 = new LongestSubsequenceWithLimitedSum2();

    @Test
    void Example1() {
        int[] nums = {4, 5, 2, 1}, queries = {3, 10, 21};

        Assertions.assertArrayEquals(new int[]{2, 3, 4}, longestSubsequenceWithLimitedSum.answerQueries(nums,queries));
        Assertions.assertArrayEquals(new int[]{2, 3, 4}, longestSubsequenceWithLimitedSum2.answerQueries(nums,queries));
    }

    @Test
    void Example2() {
        int[] nums = {2, 3, 4, 5}, queries = {1};

        Assertions.assertArrayEquals(new int[]{0}, longestSubsequenceWithLimitedSum.answerQueries(nums,queries));
        Assertions.assertArrayEquals(new int[]{0}, longestSubsequenceWithLimitedSum2.answerQueries(nums,queries));
    }
}
