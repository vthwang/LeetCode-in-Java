import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FruitIntoBasketsTest {
    FruitIntoBaskets fruitIntoBaskets = new FruitIntoBaskets();

    @Test
    void Example1() {
        int[] fruits = {1, 2, 1};

        Assertions.assertEquals(3, fruitIntoBaskets.totalFruit(fruits));
    }

    @Test
    void Example2() {
        int[] fruits = {0, 1, 2, 2};

        Assertions.assertEquals(3, fruitIntoBaskets.totalFruit(fruits));
    }

    @Test
    void Example3() {
        int[] fruits = {1, 2, 3, 2, 2};

        Assertions.assertEquals(4, fruitIntoBaskets.totalFruit(fruits));
    }
}
