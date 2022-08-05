import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinationSumIvTest {
    CombinationSumIv CombinationSumIv = new CombinationSumIv();
    CombinationSumIv2 CombinationSumIv2 = new CombinationSumIv2();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3};
        int target = 4;
        int results = CombinationSumIv.combinationSum4(nums, target);
        int expectedResults = 7;

        Assertions.assertEquals(expectedResults, results);

        results = CombinationSumIv2.combinationSum4(nums, target);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {9};
        int target = 3;
        int results = CombinationSumIv.combinationSum4(nums, target);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);

        results = CombinationSumIv2.combinationSum4(nums, target);
        Assertions.assertEquals(expectedResults, results);
    }
}
