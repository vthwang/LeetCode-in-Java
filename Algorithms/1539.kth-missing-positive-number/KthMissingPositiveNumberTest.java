import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthMissingPositiveNumberTest {
    KthMissingPositiveNumber kthMissingPositiveNumber = new KthMissingPositiveNumber();

    @Test
    void Example1() {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        Assertions.assertEquals(9, kthMissingPositiveNumber.findKthPositive(arr, k));
    }

    @Test
    void Example2() {
        int[] arr = {1, 2, 3, 4};
        int k = 2;

        Assertions.assertEquals(6, kthMissingPositiveNumber.findKthPositive(arr, k));
    }
}
