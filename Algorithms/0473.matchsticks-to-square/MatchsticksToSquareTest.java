import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatchsticksToSquareTest {
    MatchsticksToSquare MatchsticksToSquare = new MatchsticksToSquare();

    @Test
    void Example1() {
        int[] matchsticks = {1, 1, 2, 2, 2};
        boolean results = MatchsticksToSquare.makesquare(matchsticks);
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        int[] matchsticks = {3, 3, 3, 3, 4};
        boolean results = MatchsticksToSquare.makesquare(matchsticks);
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example3() {
        int[] matchsticks = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        boolean results = MatchsticksToSquare.makesquare(matchsticks);
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult, results);
    }
}
