import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockIvTest {
    BestTimeToBuyAndSellStockIv BestTimeToBuyAndSellStockIv = new BestTimeToBuyAndSellStockIv();

    @Test
    void Example1() {
        int k = 2;
        int[] prices = {2, 4, 1};
        int results = BestTimeToBuyAndSellStockIv.maxProfit(k, prices);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int k = 2;
        int[] prices = {3, 2, 6, 5, 0, 3};
        int results = BestTimeToBuyAndSellStockIv.maxProfit(k, prices);
        int expectedResults = 7;

        Assertions.assertEquals(expectedResults, results);
    }
}
