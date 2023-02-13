import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountOddNumbersInAnIntervalRangeTest {
    CountOddNumbersInAnIntervalRange countOddNumbersInAnIntervalRange = new CountOddNumbersInAnIntervalRange();

    @Test
    void Example1() {
        int low = 3, high = 7;

        Assertions.assertEquals(3, countOddNumbersInAnIntervalRange.countOdds(low, high));
    }

    @Test
    void Example2() {
        int low = 8, high = 10;

        Assertions.assertEquals(1, countOddNumbersInAnIntervalRange.countOdds(low, high));
    }
}
