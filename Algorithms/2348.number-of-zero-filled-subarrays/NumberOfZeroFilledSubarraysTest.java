import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfZeroFilledSubarraysTest {
    NumberOfZeroFilledSubarrays numberOfZeroFilledSubarrays = new NumberOfZeroFilledSubarrays();

    @Test
    void Example1() {
        int[] nums = {1, 3, 0, 0, 2, 0, 0, 4};

        Assertions.assertEquals(6, numberOfZeroFilledSubarrays.zeroFilledSubarray(nums));
    }

    @Test
    void Example2() {
        int[] nums = {0, 0, 0, 2, 0, 0};

        Assertions.assertEquals(9, numberOfZeroFilledSubarrays.zeroFilledSubarray(nums));
    }

    @Test
    void Example3() {
        int[] nums = {2, 10, 2019};

        Assertions.assertEquals(0, numberOfZeroFilledSubarrays.zeroFilledSubarray(nums));
    }
}
