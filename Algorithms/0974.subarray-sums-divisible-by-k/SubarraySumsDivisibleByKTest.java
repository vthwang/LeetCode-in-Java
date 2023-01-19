import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubarraySumsDivisibleByKTest {
    SubarraySumsDivisibleByK subarraySumsDivisibleByK = new SubarraySumsDivisibleByK();

    @Test
    void Example1() {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        Assertions.assertEquals(7, subarraySumsDivisibleByK.subarraysDivByK(nums, k));
    }

    @Test
    void Example2() {
        int[] nums = {5};
        int k = 9;

        Assertions.assertEquals(0, subarraySumsDivisibleByK.subarraysDivByK(nums, k));
    }
}
