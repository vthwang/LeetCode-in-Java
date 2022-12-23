import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockWithCooldownTest {
    BestTimeToBuyAndSellStockWithCooldown bestTimeToBuyAndSellStockWithCooldown = new BestTimeToBuyAndSellStockWithCooldown();
    BestTimeToBuyAndSellStockWithCooldown2 bestTimeToBuyAndSellStockWithCooldown2 = new BestTimeToBuyAndSellStockWithCooldown2();

    @Test
    void Example1() {
        int[] prices = {1, 2, 3, 0, 2};

        Assertions.assertEquals(3, bestTimeToBuyAndSellStockWithCooldown.maxProfit(prices));
        Assertions.assertEquals(3, bestTimeToBuyAndSellStockWithCooldown2.maxProfit(prices));
    }

    @Test
    void Example2() {
        int[] prices = {1};

        Assertions.assertEquals(0, bestTimeToBuyAndSellStockWithCooldown.maxProfit(prices));
        Assertions.assertEquals(0, bestTimeToBuyAndSellStockWithCooldown2.maxProfit(prices));
    }
}
