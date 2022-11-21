import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NearestExitFromEntranceInMazeTest {
    NearestExitFromEntranceInMaze NearestExitFromEntranceInMaze = new NearestExitFromEntranceInMaze();

    @Test
    void Example1() {
        char[][] maze = {{'+', '+', '.', '+'}, {'.', '.', '.', '+'}, {'+', '+', '+', '.'}};
        int[] entrance = {1, 2};
        int results = NearestExitFromEntranceInMaze.nearestExit(maze, entrance);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        char[][] maze = {{'+', '+', '+'}, {'.', '.', '.'}, {'+', '+', '+'}};
        int[] entrance = {1, 0};
        int results = NearestExitFromEntranceInMaze.nearestExit(maze, entrance);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        char[][] maze = {{'.', '+'}};
        int[] entrance = {0, 0};
        int results = NearestExitFromEntranceInMaze.nearestExit(maze, entrance);
        int expectedResults = -1;

        Assertions.assertEquals(expectedResults, results);
    }
}
