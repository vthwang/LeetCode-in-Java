import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGameViTest {
    JumpGameVi JumpGameVi = new JumpGameVi();
    JumpGameVi2 JumpGameVi2 = new JumpGameVi2();

    @Test
    void Example1() {
        int[] nums = {1, -1, -2, 4, -7, 3};
        int k = 2;
        int results = JumpGameVi.maxResult(nums, k);
        int expectedResults = 7;

        Assertions.assertEquals(expectedResults, results);

        results = JumpGameVi2.maxResult(nums, k);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {10, -5, -2, 4, 0, 3};
        int k = 3;
        int results = JumpGameVi.maxResult(nums, k);
        int expectedResults = 17;

        Assertions.assertEquals(expectedResults, results);

        results = JumpGameVi2.maxResult(nums, k);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {1, -5, -20, 4, -1, 3, -6, -3};
        int k = 2;
        int results = JumpGameVi.maxResult(nums, k);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);

        results = JumpGameVi2.maxResult(nums, k);
        Assertions.assertEquals(expectedResults, results);
    }
}
