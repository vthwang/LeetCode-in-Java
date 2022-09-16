import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindPeakElementTest {
    FindPeakElement FindPeakElement = new FindPeakElement();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3, 1};
        int results = FindPeakElement.findPeakElement(nums);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int results = FindPeakElement.findPeakElement(nums);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);
    }
}
