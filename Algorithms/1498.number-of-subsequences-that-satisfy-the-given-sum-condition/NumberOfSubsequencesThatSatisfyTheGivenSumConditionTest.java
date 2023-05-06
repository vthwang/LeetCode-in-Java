import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfSubsequencesThatSatisfyTheGivenSumConditionTest {
    NumberOfSubsequencesThatSatisfyTheGivenSumCondition numberOfSubsequencesThatSatisfyTheGivenSumCondition = new NumberOfSubsequencesThatSatisfyTheGivenSumCondition();

    @Test
    void Example1() {
        int[] nums = {3, 5, 6, 7};
        int target = 9;

        Assertions.assertEquals(4, numberOfSubsequencesThatSatisfyTheGivenSumCondition.numSubseq(nums, target));
    }

    @Test
    void Example2() {
        int[] nums = {3, 3, 6, 8};
        int target = 10;

        Assertions.assertEquals(6, numberOfSubsequencesThatSatisfyTheGivenSumCondition.numSubseq(nums, target));
    }

    @Test
    void Example3() {
        int[] nums = {2, 3, 3, 4, 6, 7};
        int target = 12;

        Assertions.assertEquals(61, numberOfSubsequencesThatSatisfyTheGivenSumCondition.numSubseq(nums, target));
    }
}
