import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniquePathsTest {
    UniquePaths UniquePaths = new UniquePaths();

    @Test
    void Example1() {
        int m = 3, n = 7;
        int result = UniquePaths.uniquePaths(m, n);
        int expectedResults = 28;

        Assertions.assertEquals(expectedResults, result);
    }

    @Test
    void Example2() {
        int m = 3, n = 2;
        int result = UniquePaths.uniquePaths(m , n);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, result);
    }
}
