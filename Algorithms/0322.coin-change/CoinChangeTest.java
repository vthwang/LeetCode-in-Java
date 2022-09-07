import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoinChangeTest {
    CoinChange CoinChange = new CoinChange();

    @Test
    void Example1() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int results = CoinChange.coinChange(coins, amount);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] coins = {2};
        int amount = 3;
        int results = CoinChange.coinChange(coins, amount);
        int expectedResults = -1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] coins = {1};
        int amount = 0;
        int results = CoinChange.coinChange(coins, amount);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
