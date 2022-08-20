import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {
    ClimbingStairs ClimbingStairs = new ClimbingStairs();

    @Test
    void Example1() {
        int n = 2;
        int results = ClimbingStairs.climbStairs(n);
        int expectedResult = 2;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        int n = 3;
        int results = ClimbingStairs.climbStairs(n);
        int expectedResult = 3;

        Assertions.assertEquals(expectedResult, results);
    }
}
