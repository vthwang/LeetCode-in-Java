import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {
    RotateArray RotateArray = new RotateArray();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        RotateArray.rotate(nums, k);
        int[] expectedResults = {5, 6, 7, 1, 2, 3, 4};

        Assertions.assertArrayEquals(expectedResults, nums);
    }

    @Test
    void Example2() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        RotateArray.rotate(nums, k);
        int[] expectedResults = {3, 99, -1, -100};

        Assertions.assertArrayEquals(expectedResults, nums);
    }
}
