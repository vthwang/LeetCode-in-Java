import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortAnArrayTest {
    SortAnArray sortAnArray = new SortAnArray();

    @Test
    void Example1() {
        int[] nums = {5, 2, 3, 1};

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 5}, sortAnArray.sortArray(nums));
    }

    @Test
    void Example2() {
        int[] nums = {5, 1, 1, 2, 0, 0};

        Assertions.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 5}, sortAnArray.sortArray(nums));
    }
}
