import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GasStationTest {
    GasStation gasStation = new GasStation();

    @Test
    void Example1() {
        int[] gas = {1, 2, 3, 4, 5}, cost = {3, 4, 5, 1, 2};

        Assertions.assertEquals(3, gasStation.canCompleteCircuit(gas, cost));
    }

    @Test
    void Example2() {
        int[] gas = {2, 3, 4}, cost = {3, 4, 3};

        Assertions.assertEquals(-1, gasStation.canCompleteCircuit(gas, cost));
    }
}
