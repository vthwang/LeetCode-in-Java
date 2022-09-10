import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeSumClosestClassTest {
    ThreeSumClosestClass ThreeSumClosest = new ThreeSumClosestClass();

    @Test
    void Example1() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int results = ThreeSumClosest.threeSumClosest(nums, target);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {0, 0, 0};
        int target = 1;
        int results = ThreeSumClosest.threeSumClosest(nums, target);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
