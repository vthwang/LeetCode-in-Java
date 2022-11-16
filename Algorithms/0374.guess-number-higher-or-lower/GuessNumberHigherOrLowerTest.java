import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessNumberHigherOrLowerTest {
    GuessNumberHigherOrLower GuessNumberHigherOrLower = new GuessNumberHigherOrLower();

    @Test
    void Example1() {
        int n = 10, pick = 6;
        int results = GuessNumberHigherOrLower.guessNumber(n, pick);

        Assertions.assertEquals(pick, results);
    }

    @Test
    void Example2() {
        int n = 1, pick = 1;
        int results = GuessNumberHigherOrLower.guessNumber(n, pick);

        Assertions.assertEquals(pick, results);
    }

    @Test
    void Example3() {
        int n = 2, pick = 1;
        int results = GuessNumberHigherOrLower.guessNumber(n, pick);

        Assertions.assertEquals(pick, results);
    }
}
