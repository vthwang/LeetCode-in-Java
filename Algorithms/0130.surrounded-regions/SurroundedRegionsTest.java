import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SurroundedRegionsTest {
    SurroundedRegions SurroundedRegions = new SurroundedRegions();

    @Test
    void Example1() {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        SurroundedRegions.solve(board);
        char[][] expectedResults = {{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}};

        Assertions.assertArrayEquals(expectedResults, board);
    }

    @Test
    void Example2() {
        char[][] board = {{'X'}};
        SurroundedRegions.solve(board);
        char[][] expectedResults = {{'X'}};

        Assertions.assertArrayEquals(expectedResults, board);
    }
}
