import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumUnitsOnATruckTest {
    MaximumUnitsOnATruck MaximumUnitsOnATruck = new MaximumUnitsOnATruck();

    @Test
    void Example1() {
        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;
        int results = MaximumUnitsOnATruck.maximumUnits(boxTypes, truckSize);
        int expectedResults = 8;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] boxTypes = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int truckSize = 10;
        int results = MaximumUnitsOnATruck.maximumUnits(boxTypes, truckSize);
        int expectedResults = 91;

        Assertions.assertEquals(expectedResults, results);
    }
}
