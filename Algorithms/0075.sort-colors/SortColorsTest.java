import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortColorsTest {
    SortColors SortColors = new SortColors();

    @Test
    void Example1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        SortColors.sortColors(nums);
        int[] expectedResults = {0, 0, 1, 1, 2, 2};

        Assertions.assertArrayEquals(expectedResults, nums);
    }

    @Test
    void Example2() {
        int[] nums = {2, 0, 1};
        SortColors.sortColors(nums);
        int[] expectedResults = {0, 1, 2};

        Assertions.assertArrayEquals(expectedResults, nums);
    }
}
