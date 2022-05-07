import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumIiInputArrayIsSortedTest {
    TwoSumIiInputArrayIsSorted twoSum = new TwoSumIiInputArrayIsSorted();

    @Test
    void Example1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResults = {1, 2};

        int[] results;

        results = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {2, 3, 4};
        int target = 6;
        int[] expectedResults = {1, 3};

        int[] results;

        results = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {-1, 0};
        int target = -1;
        int[] expectedResults = {1, 2};

        int[] results;

        results = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(expectedResults, results);
    }
}