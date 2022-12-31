import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniquePathsIiiTest {
    UniquePathsIii uniquePathsIii = new UniquePathsIii();

    @Test
    void Example1() {
        int[][] grid = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};

        Assertions.assertEquals(2, uniquePathsIii.uniquePathsIII(grid));
    }

    @Test
    void Example2() {
        int[][] grid = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}};

        Assertions.assertEquals(4, uniquePathsIii.uniquePathsIII(grid));
    }

    @Test
    void Example3() {
        int[][] grid = {{0, 1}, {2, 0}};

        Assertions.assertEquals(0, uniquePathsIii.uniquePathsIII(grid));
    }
}
