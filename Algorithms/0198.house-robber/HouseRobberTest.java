import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberTest {
    HouseRobber HouseRobber = new HouseRobber();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3, 1};
        int results = HouseRobber.rob(nums);
        int expectedResult = 4;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        int[] nums = {2, 7, 9, 3, 1};
        int results = HouseRobber.rob(nums);
        int expectedResult = 12;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example3() {
        int[] nums = {2, 1, 1, 2};
        int results = HouseRobber.rob(nums);
        int expectedResult = 4;

        Assertions.assertEquals(expectedResult, results);
    }
}
