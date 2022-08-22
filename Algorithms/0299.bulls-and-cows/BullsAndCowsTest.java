import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BullsAndCowsTest {
    BullsAndCows BullsAndCows = new BullsAndCows();

    @Test
    void Example1() {
        String secret = "1807", guess = "7810";
        String results = BullsAndCows.getHint(secret, guess);
        String expectedResults = "1A3B";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String secret = "1123", guess = "0111";
        String results = BullsAndCows.getHint(secret, guess);
        String expectedResults = "1A1B";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String secret = "11", guess = "11";
        String results = BullsAndCows.getHint(secret, guess);
        String expectedResults = "2A0B";

        Assertions.assertEquals(expectedResults, results);
    }
}
