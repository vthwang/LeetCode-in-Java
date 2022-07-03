import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WiggleSubsequenceTest {
    WiggleSubsequence WiggleSubsequence = new WiggleSubsequence();

    @Test
    void Example1() {
        int[] nums = {1, 7, 4, 9, 2, 5};
        int results = WiggleSubsequence.wiggleMaxLength(nums);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        int results = WiggleSubsequence.wiggleMaxLength(nums);
        int expectedResults = 7;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int results = WiggleSubsequence.wiggleMaxLength(nums);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        int[] nums = {0, 0};
        int results = WiggleSubsequence.wiggleMaxLength(nums);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example5() {
        int[] nums = {3, 3, 3, 2, 5};
        int results = WiggleSubsequence.wiggleMaxLength(nums);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }
}
