import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheapestFlightsWithinKStopsTest {
    CheapestFlightsWithinKStops cheapestFlightsWithinKStops = new CheapestFlightsWithinKStops();

    @Test
    void Example1() {
        int n = 4;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0, dst = 3, k = 1;

        Assertions.assertEquals(700, cheapestFlightsWithinKStops.findCheapestPrice(n, flights, src, dst, k));
    }

    @Test
    void Example2() {
        int n = 3;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0, dst = 2, k = 1;

        Assertions.assertEquals(200, cheapestFlightsWithinKStops.findCheapestPrice(n, flights, src, dst, k));
    }

    @Test
    void Example3() {
        int n = 3;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0, dst = 2, k = 0;

        Assertions.assertEquals(500, cheapestFlightsWithinKStops.findCheapestPrice(n, flights, src, dst, k));
    }
}
