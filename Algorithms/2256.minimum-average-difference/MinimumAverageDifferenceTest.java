import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumAverageDifferenceTest {
    MinimumAverageDifference minimumAverageDifference = new MinimumAverageDifference();
    MinimumAverageDifference2 minimumAverageDifference2 = new MinimumAverageDifference2();

    @Test
    void Example1() {
        int[] nums = {2, 5, 3, 9, 5, 3};
        int results = minimumAverageDifference.minimumAverageDifference(nums);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);

        results = minimumAverageDifference2.minimumAverageDifference(nums);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {0};
        int results = minimumAverageDifference.minimumAverageDifference(nums);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);

        results = minimumAverageDifference2.minimumAverageDifference(nums);
        Assertions.assertEquals(expectedResults, results);
    }
}
