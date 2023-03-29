import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReducingDishesTest {
    ReducingDishes reducingDishes = new ReducingDishes();

    @Test
    void Example1() {
        int[] satisfaction = {-1, -8, 0, 5, -9};

        Assertions.assertEquals(14, reducingDishes.maxSatisfaction(satisfaction));
    }

    @Test
    void Example2() {
        int[] satisfaction = {4, 3, 2};

        Assertions.assertEquals(20, reducingDishes.maxSatisfaction(satisfaction));
    }

    @Test
    void Example3() {
        int[] satisfaction = {-1, -4, -5};

        Assertions.assertEquals(0, reducingDishes.maxSatisfaction(satisfaction));
    }
}
