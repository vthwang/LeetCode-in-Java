import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimizeDeviationInArrayTest {
    MinimizeDeviationInArray minimizeDeviationInArray = new MinimizeDeviationInArray();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3, 4};

        Assertions.assertEquals(1, minimizeDeviationInArray.minimumDeviation(nums));
    }

    @Test
    void Example2() {
        int[] nums = {4, 1, 5, 20, 3};

        Assertions.assertEquals(3, minimizeDeviationInArray.minimumDeviation(nums));
    }

    @Test
    void Example3() {
        int[] nums = {2, 10, 8};

        Assertions.assertEquals(3, minimizeDeviationInArray.minimumDeviation(nums));
    }
}
