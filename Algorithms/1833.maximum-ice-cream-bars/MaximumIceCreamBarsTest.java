import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumIceCreamBarsTest {
    MaximumIceCreamBars maximumIceCreamBars = new MaximumIceCreamBars();
    MaximumIceCreamBars2 maximumIceCreamBars2 = new MaximumIceCreamBars2();

    @Test
    void Example1() {
        int[] costs = {1, 3, 2, 4, 1};
        int coins = 7;

        Assertions.assertEquals(4, maximumIceCreamBars.maxIceCream(costs, coins));
        Assertions.assertEquals(4, maximumIceCreamBars2.maxIceCream(costs, coins));
    }

    @Test
    void Example2() {
        int[] costs = {10, 6, 8, 7, 7, 8};
        int coins = 5;

        Assertions.assertEquals(0, maximumIceCreamBars.maxIceCream(costs, coins));
        Assertions.assertEquals(0, maximumIceCreamBars2.maxIceCream(costs, coins));
    }

    @Test
    void Example3() {
        int[] costs = {1, 6, 3, 1, 2, 5};
        int coins = 20;

        Assertions.assertEquals(6, maximumIceCreamBars.maxIceCream(costs, coins));
        Assertions.assertEquals(6, maximumIceCreamBars2.maxIceCream(costs, coins));
    }
}
