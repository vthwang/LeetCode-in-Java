import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindOriginalArrayFromDoubledArrayTest {
    FindOriginalArrayFromDoubledArray FindOriginalArrayFromDoubledArray = new FindOriginalArrayFromDoubledArray();

    @Test
    void Example1() {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] results = FindOriginalArrayFromDoubledArray.findOriginalArray(changed);
        int[] expectedResults = {1, 3, 4};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] changed = {6, 3, 0, 1};
        int[] results = FindOriginalArrayFromDoubledArray.findOriginalArray(changed);
        int[] expectedResults = {};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] changed = {1};
        int[] results = FindOriginalArrayFromDoubledArray.findOriginalArray(changed);
        int[] expectedResults = {};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
