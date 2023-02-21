import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleElementInASortedArrayTest {
    SingleElementInASortedArray SingleElementInASortedArray = new SingleElementInASortedArray();

    @Test
    void Example1() {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        Assertions.assertEquals(2, SingleElementInASortedArray.singleNonDuplicate(nums));
    }

    @Test
    void Example2() {
        int[] nums = {3, 3, 7, 7, 10, 11, 11};

        Assertions.assertEquals(10, SingleElementInASortedArray.singleNonDuplicate(nums));
    }
}
