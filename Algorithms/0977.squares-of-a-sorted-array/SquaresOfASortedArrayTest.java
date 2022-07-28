import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquaresOfASortedArrayTest {
    SquaresOfASortedArray SquaresOfASortedArray = new SquaresOfASortedArray();
    SquaresOfASortedArray2 SquaresOfASortedArray2 = new SquaresOfASortedArray2();

    @Test
    void Example1() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] results = SquaresOfASortedArray.sortedSquares(nums);
        int[] expectedResults = {0, 1, 9, 16, 100};

        Assertions.assertArrayEquals(expectedResults, results);

        results = SquaresOfASortedArray2.sortedSquares(nums);
        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] results = SquaresOfASortedArray.sortedSquares(nums);
        int[] expectedResults = {4, 9, 9, 49, 121};

        Assertions.assertArrayEquals(expectedResults, results);

        results = SquaresOfASortedArray2.sortedSquares(nums);
        Assertions.assertArrayEquals(expectedResults, results);
    }
}
