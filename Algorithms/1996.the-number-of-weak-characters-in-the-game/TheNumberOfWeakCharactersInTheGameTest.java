import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TheNumberOfWeakCharactersInTheGameTest {
    TheNumberOfWeakCharactersInTheGame TheNumberOfWeakCharactersInTheGame = new TheNumberOfWeakCharactersInTheGame();

    @Test
    void Example1() {
        int[][] properties = {{5, 5}, {6, 3}, {3, 6}};
        int results = TheNumberOfWeakCharactersInTheGame.numberOfWeakCharacters(properties);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] properties = {{2, 2}, {3, 3}};
        int results = TheNumberOfWeakCharactersInTheGame.numberOfWeakCharacters(properties);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[][] properties = {{1, 5}, {10, 4}, {4, 3}};
        int results = TheNumberOfWeakCharactersInTheGame.numberOfWeakCharacters(properties);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
