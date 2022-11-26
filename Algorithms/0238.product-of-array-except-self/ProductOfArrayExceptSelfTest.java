import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {
    ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
    ProductOfArrayExceptSelf2 productOfArrayExceptSelf2 = new ProductOfArrayExceptSelf2();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3 ,4};
        int[] results = productOfArrayExceptSelf.productExceptSelf(nums);

        Assertions.assertArrayEquals(new int[]{24, 12, 8, 6}, results);

        results = productOfArrayExceptSelf2.productExceptSelf(nums);

        Assertions.assertArrayEquals(new int[]{24, 12, 8, 6}, results);
    }

    @Test
    void Example2() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] results = productOfArrayExceptSelf.productExceptSelf(nums);

        Assertions.assertArrayEquals(new int[]{0, 0, 9, 0, 0}, results);

        results = productOfArrayExceptSelf2.productExceptSelf(nums);

        Assertions.assertArrayEquals(new int[]{0, 0, 9, 0, 0}, results);
    }
}
