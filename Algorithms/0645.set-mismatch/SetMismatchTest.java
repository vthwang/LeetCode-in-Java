import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SetMismatchTest {
    SetMismatch SetMismatch = new SetMismatch();

    @Test
    void Example1() {
        int[] nums = {1, 2, 2, 4};

        int[] results = SetMismatch.findErrorNums(nums);
        int[] expectedResults = {2, 3};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 1};

        int[] results = SetMismatch.findErrorNums(nums);
        int[] expectedResults = {1, 2};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
