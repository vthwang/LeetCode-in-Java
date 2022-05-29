import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveZeroesTest {
    MoveZeroes MoveZeroes = new MoveZeroes();

    @Test
    void Example1() {
        int[] nums = {0, 1, 0, 3, 12};

        MoveZeroes.moveZeroes(nums);
        int[] expectedResults = {1, 3, 12, 0, 0};

        Assertions.assertArrayEquals(expectedResults, nums);
    }

    @Test
    void Example2() {
        int[] nums = {0};

        MoveZeroes.moveZeroes(nums);
        int[] expectedResults = {0};

        Assertions.assertArrayEquals(expectedResults, nums);
    }
}
