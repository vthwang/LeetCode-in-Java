import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AddToArrayFormOfIntegerTest {
    AddToArrayFormOfInteger addToArrayFormOfInteger = new AddToArrayFormOfInteger();

    @Test
    void Example1() {
        int[] num = {1, 2, 0, 0};
        int k = 34;

        Assertions.assertEquals(Arrays.asList(1, 2, 3, 4), addToArrayFormOfInteger.addToArrayForm(num, k));
    }

    @Test
    void Example2() {
        int[] num = {2, 7, 4};
        int k = 181;

        Assertions.assertEquals(Arrays.asList(4, 5, 5), addToArrayFormOfInteger.addToArrayForm(num, k));
    }

    @Test
    void Example3() {
        int[] num = {2, 1, 5};
        int k = 806;

        Assertions.assertEquals(Arrays.asList(1, 0, 2, 1), addToArrayFormOfInteger.addToArrayForm(num, k));
    }

    @Test
    void Example4() {
        int[] num = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k = 1;

        Assertions.assertEquals(Arrays.asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), addToArrayFormOfInteger.addToArrayForm(num, k));
    }

    @Test
    void Example5() {
        int[] num = {1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3};
        int k = 1;

        Assertions.assertEquals(Arrays.asList(1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 5, 7, 9), addToArrayFormOfInteger.addToArrayForm(num, k));
    }
}
