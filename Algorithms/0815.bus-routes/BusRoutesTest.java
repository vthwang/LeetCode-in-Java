import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BusRoutesTest {
    BusRoutes BusRoutes = new BusRoutes();

    @Test
    void Example1() {
        int[][] routes = {{1, 2, 7}, {3, 6, 7}};
        int source = 1, target = 6;
        int results = BusRoutes.numBusesToDestination(routes, source, target);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] routes = {{7, 12}, {4, 5, 15}, {6}, {15, 19}, {9, 12, 13}};
        int source = 15, target = 12;
        int results = BusRoutes.numBusesToDestination(routes, source, target);
        int expectedResults = -1;

        Assertions.assertEquals(expectedResults, results);
    }
}
