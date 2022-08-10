import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunningSumOf1dArrayTest {
    RunningSumOf1dArray RunningSumOf1dArray = new RunningSumOf1dArray();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3, 4};
        int[] results = RunningSumOf1dArray.runningSum(nums);
        int[] expectedResults = {1, 3, 6, 10};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 1, 1, 1, 1};
        int[] results = RunningSumOf1dArray.runningSum(nums);
        int[] expectedResults = {1, 2, 3, 4, 5};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {3, 1, 2, 10, 1};
        int[] results = RunningSumOf1dArray.runningSum(nums);
        int[] expectedResults = {3, 4, 6, 16, 17};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
