import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanPlaceFlowersTest {
    CanPlaceFlowers CanPlaceFlowers = new CanPlaceFlowers();

    @Test
    void Example1() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean results = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        boolean results = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
