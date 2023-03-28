import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumCostForTicketsTest {
    MinimumCostForTickets minimumCostForTickets = new MinimumCostForTickets();

    @Test
    void Example1() {
        int[] days = {1, 4, 6, 7, 8, 20}, costs = {2, 7, 15};

        Assertions.assertEquals(11, minimumCostForTickets.mincostTickets(days, costs));
    }

    @Test
    void Example2() {
        int[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, costs = {2, 7, 15};

        Assertions.assertEquals(17, minimumCostForTickets.mincostTickets(days, costs));
    }
}
