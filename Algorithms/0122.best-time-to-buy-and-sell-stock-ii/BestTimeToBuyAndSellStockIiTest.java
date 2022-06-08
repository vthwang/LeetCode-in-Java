import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockIiTest {
    BestTimeToBuyAndSellStockIi BestTimeToBuyAndSellStockIi = new BestTimeToBuyAndSellStockIi();

    @Test
    void Example1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int results = BestTimeToBuyAndSellStockIi.maxProfit(prices);
        int expectedResults = 7;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] prices = {1, 2, 3, 4, 5};
        int results = BestTimeToBuyAndSellStockIi.maxProfit(prices);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] prices = {7, 6, 4, 3, 1};
        int results = BestTimeToBuyAndSellStockIi.maxProfit(prices);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
