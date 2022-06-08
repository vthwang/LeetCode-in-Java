import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock BestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    void Example1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int results = BestTimeToBuyAndSellStock.maxProfit(prices);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] prices = {7, 6, 4, 3, 1};
        int results = BestTimeToBuyAndSellStock.maxProfit(prices);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] prices = {1, 2};
        int results = BestTimeToBuyAndSellStock.maxProfit(prices);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
