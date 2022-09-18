import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrappingRainWaterTest {
    TrappingRainWater TrappingRainWater = new TrappingRainWater();

    @Test
    void Example1() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int results = TrappingRainWater.trap(height);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] height = {4, 2, 0, 3, 2, 5};
        int results = TrappingRainWater.trap(height);
        int expectedResults = 9;

        Assertions.assertEquals(expectedResults, results);
    }
}
