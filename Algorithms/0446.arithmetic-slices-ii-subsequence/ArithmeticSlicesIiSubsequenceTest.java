import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticSlicesIiSubsequenceTest {
    ArithmeticSlicesIiSubsequence arithmeticSlicesIiSubsequence = new ArithmeticSlicesIiSubsequence();

    @Test
    void Example1() {
        int[] nums = {2, 4, 6, 8, 10};
        int results = arithmeticSlicesIiSubsequence.numberOfArithmeticSlices(nums);

        Assertions.assertEquals(7, results);
    }

    @Test
    void Example2() {
        int[] nums = {7, 7, 7, 7, 7};
        int results = arithmeticSlicesIiSubsequence.numberOfArithmeticSlices(nums);

        Assertions.assertEquals(16, results);
    }
}
