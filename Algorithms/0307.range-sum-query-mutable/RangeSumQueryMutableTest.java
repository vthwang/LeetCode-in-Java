import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RangeSumQueryMutableTest {
    @Test
    void Example1() {
        int[] nums = {1, 3, 5};
        NumArray NumArray = new NumArray(nums);
        int result1 = NumArray.sumRange(0, 2);
        Assertions.assertEquals(9, result1);

        NumArray.update(1, 2);
        int result2 = NumArray.sumRange(0, 2);
        Assertions.assertEquals(8, result2);
    }
}
