import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumberTest {
    SingleNumber SingleNumber = new SingleNumber();

    @Test
    void Example1() {
        int[] nums = {2, 2, 1};
        int results = SingleNumber.singleNumber(nums);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {4, 1, 2, 1, 2};
        int results = SingleNumber.singleNumber(nums);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {1};
        int results = SingleNumber.singleNumber(nums);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
