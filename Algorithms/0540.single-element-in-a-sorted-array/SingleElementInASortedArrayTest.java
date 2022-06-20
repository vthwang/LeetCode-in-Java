import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleElementInASortedArrayTest {
    SingleElementInASortedArray SingleElementInASortedArray = new SingleElementInASortedArray();

    @Test
    void Example1() {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int results = SingleElementInASortedArray.singleNonDuplicate(nums);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {3, 3, 7, 7, 10, 11, 11};
        int results = SingleElementInASortedArray.singleNonDuplicate(nums);
        int expectedResults = 10;

        Assertions.assertEquals(expectedResults, results);
    }
}
