import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {
    ContainerWithMostWater ContainerWithMostWater = new ContainerWithMostWater();

    @Test
    void Example1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int results = ContainerWithMostWater.maxArea(height);
        int expectedResults = 49;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] height = {1, 1};
        int results = ContainerWithMostWater.maxArea(height);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
