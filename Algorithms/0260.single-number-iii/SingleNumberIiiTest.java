import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumberIiiTest {
    SingleNumberIii SingleNumberIii = new SingleNumberIii();

    @Test
    void Example1() {
        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] results = SingleNumberIii.singleNumber(nums);
        int[] expectedResults = {5, 3};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {-1, 0};
        int[] results = SingleNumberIii.singleNumber(nums);
        int[] expectedResults = {0, -1};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {0, 1};
        int[] results = SingleNumberIii.singleNumber(nums);
        int[] expectedResults = {0, 1};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
