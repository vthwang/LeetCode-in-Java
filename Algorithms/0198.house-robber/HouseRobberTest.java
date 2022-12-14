import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberTest {
    HouseRobber houseRobber = new HouseRobber();
    HouseRobber2 houseRobber2 = new HouseRobber2();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3, 1};

        Assertions.assertEquals(4, houseRobber.rob(nums));
        Assertions.assertEquals(4, houseRobber2.rob(nums));
    }

    @Test
    void Example2() {
        int[] nums = {2, 7, 9, 3, 1};

        Assertions.assertEquals(12, houseRobber.rob(nums));
        Assertions.assertEquals(12, houseRobber2.rob(nums));
    }

    @Test
    void Example3() {
        int[] nums = {2, 1, 1, 2};

        Assertions.assertEquals(4, houseRobber.rob(nums));
        Assertions.assertEquals(4, houseRobber2.rob(nums));
    }
}
