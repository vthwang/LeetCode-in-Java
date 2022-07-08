import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaintHouseIiiTest {
    PaintHouseIii PaintHouseIii = new PaintHouseIii();

    @Test
    void Example1() {
        int[] houses = {0, 0, 0, 0, 0};
        int[][] cost = {{1, 10}, {10, 1}, {10, 1}, {1, 10}, {5, 1}};
        int m = 5, n = 2, target = 3;
        int results = PaintHouseIii.minCost(houses, cost, m, n, target);
        int expectedResults = 9;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] houses = {0, 2, 1, 2, 0};
        int[][] cost = {{1, 10}, {10, 1}, {10, 1}, {1, 10}, {5, 1}};
        int m = 5, n = 2, target = 3;
        int results = PaintHouseIii.minCost(houses, cost, m, n, target);
        int expectedResults = 11;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] houses = {3, 1, 2, 3};
        int[][] cost = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int m = 4, n = 3, target = 3;
        int results = PaintHouseIii.minCost(houses, cost, m, n, target);
        int expectedResults = -1;

        Assertions.assertEquals(expectedResults, results);
    }
}
