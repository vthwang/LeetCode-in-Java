import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveStonesToMinimizeTheTotalTest {
    RemoveStonesToMinimizeTheTotal removeStonesToMinimizeTheTotal = new RemoveStonesToMinimizeTheTotal();

    @Test
    void Example1() {
        int[] piles = {5, 4, 9};
        int k = 2;

        Assertions.assertEquals(12, removeStonesToMinimizeTheTotal.minStoneSum(piles, k));
    }

    @Test
    void Example2() {
        int[] piles = {4, 3, 6, 7};
        int k = 3;

        Assertions.assertEquals(12, removeStonesToMinimizeTheTotal.minStoneSum(piles, k));
    }
}
