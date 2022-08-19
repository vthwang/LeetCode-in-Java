import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SplitArrayIntoConsecutiveSubsequencesTest {
    SplitArrayIntoConsecutiveSubsequences SplitArrayIntoConsecutiveSubsequences = new SplitArrayIntoConsecutiveSubsequences();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3, 3, 4, 5};
        boolean results = SplitArrayIntoConsecutiveSubsequences.isPossible(nums);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 2, 3, 3, 4, 4, 5, 5};
        boolean results = SplitArrayIntoConsecutiveSubsequences.isPossible(nums);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {1, 2, 3, 4, 4, 5};
        boolean results = SplitArrayIntoConsecutiveSubsequences.isPossible(nums);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
