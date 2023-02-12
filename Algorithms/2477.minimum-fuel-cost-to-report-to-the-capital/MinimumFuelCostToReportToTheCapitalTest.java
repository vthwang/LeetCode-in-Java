import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumFuelCostToReportToTheCapitalTest {
    MinimumFuelCostToReportToTheCapital minimumFuelCostToReportToTheCapital = new MinimumFuelCostToReportToTheCapital();

    @Test
    void Example1() {
        int[][] roads = {{0, 1}, {0, 2}, {0, 3}};
        int seats = 5;

        Assertions.assertEquals(3, minimumFuelCostToReportToTheCapital.minimumFuelCost(roads, seats));
    }

    @Test
    void Example2() {
        int[][] roads = {{3, 1}, {3, 2}, {1, 0}, {0, 4}, {0, 5}, {4, 6}};
        int seats = 2;

        Assertions.assertEquals(7, minimumFuelCostToReportToTheCapital.minimumFuelCost(roads, seats));
    }

    @Test
    void Example3() {
        int[][] roads = {};
        int seats = 1;

        Assertions.assertEquals(0, minimumFuelCostToReportToTheCapital.minimumFuelCost(roads, seats));
    }
}
