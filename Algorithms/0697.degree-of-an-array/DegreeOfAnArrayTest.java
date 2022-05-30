import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DegreeOfAnArrayTest {
    DegreeOfAnArray DegreeOfAnArray = new DegreeOfAnArray();

    @Test
    void Example1() {
        int[] nums = {1, 2, 2, 3, 1};
        int results = DegreeOfAnArray.findShortestSubArray(nums);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        int results = DegreeOfAnArray.findShortestSubArray(nums);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }
}
