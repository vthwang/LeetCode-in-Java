import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxSumOfRectangleNoLargerThanKTest {
    MaxSumOfRectangleNoLargerThanK MaxSumOfRectangleNoLargerThanK = new MaxSumOfRectangleNoLargerThanK();

    @Test
    void Example1() {
        int[][] matrix = {{1, 0, 1}, {0, -2, 3}};
        int k = 2;
        int results = MaxSumOfRectangleNoLargerThanK.maxSumSubmatrix(matrix, k);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] matrix = {{2, 2, -1}};
        int k = 3;
        int results = MaxSumOfRectangleNoLargerThanK.maxSumSubmatrix(matrix, k);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }
}
