import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SignOfTheProductOfAnArrayTest {
    SignOfTheProductOfAnArray signOfTheProductOfAnArray = new SignOfTheProductOfAnArray();

    @Test
    void Example1() {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};

        Assertions.assertEquals(1, signOfTheProductOfAnArray.arraySign(nums));
    }

    @Test
    void Example2() {
        int[] nums = {1, 5, 0, 2, -3};

        Assertions.assertEquals(0, signOfTheProductOfAnArray.arraySign(nums));
    }

    @Test
    void Example3() {
        int[] nums = {-1, 1, -1, 1, -1};

        Assertions.assertEquals(-1, signOfTheProductOfAnArray.arraySign(nums));
    }
}
