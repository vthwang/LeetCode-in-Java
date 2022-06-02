import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {
    MissingNumber MissingNumber = new MissingNumber();

    @Test
    void Example1() {
        int[] nums = {3, 0, 1};
        int results = MissingNumber.missingNumber(nums);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {0, 1};
        int results = MissingNumber.missingNumber(nums);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int results = MissingNumber.missingNumber(nums);
        int expectedResults = 8;

        Assertions.assertEquals(expectedResults, results);
    }
}
