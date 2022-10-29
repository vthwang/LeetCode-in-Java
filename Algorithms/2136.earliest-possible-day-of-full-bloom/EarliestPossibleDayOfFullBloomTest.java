import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EarliestPossibleDayOfFullBloomTest {
    EarliestPossibleDayOfFullBloom EarliestPossibleDayOfFullBloom = new EarliestPossibleDayOfFullBloom();

    @Test
    void Example1() {
        int[] plantTime = {1, 4, 3},  growTime = {2, 3, 1};
        int results = EarliestPossibleDayOfFullBloom.earliestFullBloom(plantTime, growTime);
        int expectedResults = 9;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] plantTime = {1, 2, 3, 2},  growTime = {2, 1, 2, 1};
        int results = EarliestPossibleDayOfFullBloom.earliestFullBloom(plantTime, growTime);
        int expectedResults = 9;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] plantTime = {1},  growTime = {1};
        int results = EarliestPossibleDayOfFullBloom.earliestFullBloom(plantTime, growTime);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
