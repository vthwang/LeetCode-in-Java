import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DailyTemperaturesTest {
    DailyTemperatures dailyTemperatures = new DailyTemperatures();

    @Test
    void Example1() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        Assertions.assertArrayEquals(new int []{1, 1, 4, 2, 1, 1, 0, 0}, dailyTemperatures.dailyTemperatures(temperatures));
    }

    @Test
    void Example2() {
        int[] temperatures = {30, 40, 50, 60};

        Assertions.assertArrayEquals(new int []{1, 1, 1, 0}, dailyTemperatures.dailyTemperatures(temperatures));
    }

    @Test
    void Example3() {
        int[] temperatures = {30, 60, 90};

        Assertions.assertArrayEquals(new int []{1, 1, 0}, dailyTemperatures.dailyTemperatures(temperatures));
    }
}
