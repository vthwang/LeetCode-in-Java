import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGameTest {
    JumpGame jumpGame = new JumpGame();

    @Test
    void Example1() {
        int[] nums = {2, 3, 1, 1, 4};

        Assertions.assertTrue(jumpGame.canJump(nums));
    }

    @Test
    void Example2() {
        int[] nums = {3, 2, 1, 0, 4};

        Assertions.assertFalse(jumpGame.canJump(nums));
    }
}
