import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IpoTest {
    Ipo ipo = new Ipo();

    @Test
    void Example1() {
        int k = 2, w = 0;
        int[] profits = {1, 2, 3},  capital = {0, 1, 1};

        Assertions.assertEquals(4, ipo.findMaximizedCapital(k, w, profits, capital));
    }

    @Test
    void Example2() {
        int k = 3, w = 0;
        int[] profits = {1, 2, 3},  capital = {0, 1, 2};

        Assertions.assertEquals(6, ipo.findMaximizedCapital(k, w, profits, capital));
    }
}
