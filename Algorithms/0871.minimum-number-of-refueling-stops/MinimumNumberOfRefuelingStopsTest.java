import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumNumberOfRefuelingStopsTest {
    MinimumNumberOfRefuelingStops MinimumNumberOfRefuelingStops = new MinimumNumberOfRefuelingStops();

    @Test
    void Example1() {
        int target = 1, startFuel = 1;
        int[][] stations = {};
        int results = MinimumNumberOfRefuelingStops.minRefuelStops(target, startFuel, stations);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int target = 100, startFuel = 1;
        int[][] stations = {{10, 100}};
        int results = MinimumNumberOfRefuelingStops.minRefuelStops(target, startFuel, stations);
        int expectedResults = -1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int target = 100, startFuel = 10;
        int[][] stations = {{10, 60}, {20, 30}, {30, 30}, {60, 40}};
        int results = MinimumNumberOfRefuelingStops.minRefuelStops(target, startFuel, stations);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
