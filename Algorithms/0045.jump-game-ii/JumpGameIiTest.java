import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGameIiTest {
    JumpGameIi jumpGameIi = new JumpGameIi();

    @Test
    void Example1() {
        int[] nums = {2, 3, 1, 1, 4};

        Assertions.assertEquals(2, jumpGameIi.jump(nums));
    }

    @Test
    void Example2() {
        int[] nums = {2, 3, 0, 1, 4};

        Assertions.assertEquals(2, jumpGameIi.jump(nums));
    }
}
