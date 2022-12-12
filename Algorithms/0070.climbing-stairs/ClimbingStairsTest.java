import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {
    ClimbingStairs climbingStairs = new ClimbingStairs();
    ClimbingStairs2 climbingStairs2 = new ClimbingStairs2();
    ClimbingStairs3 climbingStairs3 = new ClimbingStairs3();
    ClimbingStairs4 climbingStairs4 = new ClimbingStairs4();

    @Test
    void Example1() {
        int n = 2;

        Assertions.assertEquals(2, climbingStairs.climbStairs(n));
        Assertions.assertEquals(2, climbingStairs2.climbStairs(n));
        Assertions.assertEquals(2, climbingStairs3.climbStairs(n));
        Assertions.assertEquals(2, climbingStairs4.climbStairs(n));
    }

    @Test
    void Example2() {
        int n = 3;

        Assertions.assertEquals(3, climbingStairs.climbStairs(n));
        Assertions.assertEquals(3, climbingStairs2.climbStairs(n));
        Assertions.assertEquals(3, climbingStairs3.climbStairs(n));
        Assertions.assertEquals(3, climbingStairs4.climbStairs(n));
    }
}
