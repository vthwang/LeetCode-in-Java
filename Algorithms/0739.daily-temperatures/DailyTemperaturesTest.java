import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DailyTemperaturesTest {
    DailyTemperatures DailyTemperatures = new DailyTemperatures();

    @Test
    void Example1() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] results = DailyTemperatures.dailyTemperatures(temperatures);
        int[] expectedResults = {1, 1, 4, 2, 1, 1, 0, 0};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] temperatures = {30, 40, 50, 60};
        int[] results = DailyTemperatures.dailyTemperatures(temperatures);
        int[] expectedResults = {1, 1, 1, 0};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] temperatures = {30, 60, 90};
        int[] results = DailyTemperatures.dailyTemperatures(temperatures);
        int[] expectedResults = {1, 1, 0};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
