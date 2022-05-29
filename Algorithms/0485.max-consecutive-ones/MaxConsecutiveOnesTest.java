import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {
    MaxConsecutiveOnes MaxConsecutiveOnes = new MaxConsecutiveOnes();

    @Test
    void Example1() {
        int[] nums = {1, 1, 0, 1, 1, 1};

        int results = MaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 0, 1, 1, 0, 1};

        int results = MaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
