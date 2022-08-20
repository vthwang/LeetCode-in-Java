import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfIslandsTest {
    NumberOfIslands NumberOfIslands = new NumberOfIslands();

    @Test
    void Example1() {
        char[][] grid = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        int results = NumberOfIslands.numIslands(grid);
        int expectedResult = 1;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        char[][] grid = {{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        int results = NumberOfIslands.numIslands(grid);
        int expectedResult = 3;

        Assertions.assertEquals(expectedResult, results);
    }
}
