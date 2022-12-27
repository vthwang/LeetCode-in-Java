import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumBagsWithFullCapacityOfRocksTest {
    MaximumBagsWithFullCapacityOfRocks maximumBagsWithFullCapacityOfRocks = new MaximumBagsWithFullCapacityOfRocks();

    @Test
    void Example1() {
        int[] capacity = {2, 3, 4, 5},  rocks = {1, 2, 4, 4};
        int additionalRocks = 2;

        Assertions.assertEquals(3, maximumBagsWithFullCapacityOfRocks.maximumBags(capacity, rocks, additionalRocks));
    }

    @Test
    void Example2() {
        int[] capacity = {10, 2, 2},  rocks = {2, 2, 0};
        int additionalRocks = 100;

        Assertions.assertEquals(3, maximumBagsWithFullCapacityOfRocks.maximumBags(capacity, rocks, additionalRocks));
    }
}
