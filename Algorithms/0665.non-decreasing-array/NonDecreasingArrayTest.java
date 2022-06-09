import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonDecreasingArrayTest {
    NonDecreasingArray NonDecreasingArray = new NonDecreasingArray();

    @Test
    void Example1() {
        int[] nums = {4, 2, 3};
        boolean results = NonDecreasingArray.checkPossibility(nums);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {4, 2, 1};
        boolean results = NonDecreasingArray.checkPossibility(nums);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
