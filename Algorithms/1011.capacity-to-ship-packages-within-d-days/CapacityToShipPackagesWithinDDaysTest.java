import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CapacityToShipPackagesWithinDDaysTest {
    CapacityToShipPackagesWithinDDays capacityToShipPackagesWithinDDays = new CapacityToShipPackagesWithinDDays();

    @Test
    void Example1() {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;

        Assertions.assertEquals(15, capacityToShipPackagesWithinDDays.shipWithinDays(weights, days));
    }

    @Test
    void Example2() {
        int[] weights = {3, 2, 2, 4, 1, 4};
        int days = 3;

        Assertions.assertEquals(6, capacityToShipPackagesWithinDDays.shipWithinDays(weights, days));
    }

    @Test
    void Example3() {
        int[] weights = {1, 2, 3, 1, 1};
        int days = 4;

        Assertions.assertEquals(3, capacityToShipPackagesWithinDDays.shipWithinDays(weights, days));
    }
}
