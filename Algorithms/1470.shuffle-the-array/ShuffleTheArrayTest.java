import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShuffleTheArrayTest {
    ShuffleTheArray shuffleTheArray = new ShuffleTheArray();

    @Test
    void Example1() {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        Assertions.assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, shuffleTheArray.shuffle(nums, n));
    }

    @Test
    void Example2() {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;

        Assertions.assertArrayEquals(new int[]{1, 4, 2, 3, 3, 2, 4, 1}, shuffleTheArray.shuffle(nums, n));
    }

    @Test
    void Example3() {
        int[] nums = {1,1,2,2};
        int n = 2;

        Assertions.assertArrayEquals(new int[]{1, 2, 1, 2}, shuffleTheArray.shuffle(nums, n));
    }
}
